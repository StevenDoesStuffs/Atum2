package com.teammetallurgy.atum.blocks;

import com.teammetallurgy.atum.init.AtumBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SandLayersBlock extends FallingBlock {
    private static final Material SAND_LAYER = new Material.Builder(MaterialColor.SAND).noCollider().notSolidBlocking().nonSolid().destroyOnPush().replaceable().build();
    public static final IntegerProperty LAYERS = BlockStateProperties.LAYERS;
    private static final VoxelShape[] SAND_SHAPE = new VoxelShape[]{Shapes.empty(), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};

    public SandLayersBlock() {
        super(Block.Properties.of(SAND_LAYER).strength(0.1F).sound(SoundType.SAND));
        this.registerDefaultState(this.stateDefinition.any().setValue(LAYERS, 1));
    }

    @Override
    @Nonnull
    public VoxelShape getShape(BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        return SAND_SHAPE[state.getValue(LAYERS)];
    }

    @Override
    @Nonnull
    public VoxelShape getCollisionShape(BlockState state, @Nonnull BlockGetter world, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        return SAND_SHAPE[state.getValue(LAYERS) - 1];
    }

    @Override
    @Nonnull
    public VoxelShape getBlockSupportShape(BlockState state, @Nonnull BlockGetter reader, @Nonnull BlockPos pos) {
        return SAND_SHAPE[state.getValue(LAYERS)];
    }

    @Override
    @Nonnull
    public VoxelShape getVisualShape(BlockState state, @Nonnull BlockGetter reader, @Nonnull BlockPos pos, @Nonnull CollisionContext context) {
        return SAND_SHAPE[state.getValue(LAYERS)];
    }

    @Override
    public boolean isPathfindable(@Nonnull BlockState state, @Nonnull BlockGetter reader, @Nonnull BlockPos pos, @Nonnull PathComputationType pathType) {
        if (pathType == PathComputationType.LAND) {
            return state.getValue(LAYERS) < 5;
        } else {
            return false;
        }
    }

    @Override
    public boolean useShapeForLightOcclusion(@Nonnull BlockState state) {
        return true;
    }

    @Override
    public boolean canSurvive(@Nonnull BlockState state, @Nonnull LevelReader world, BlockPos pos) {
        BlockState stateDown = world.getBlockState(pos.below());
        if (!stateDown.is(Blocks.ICE) && !stateDown.is(Blocks.PACKED_ICE) && !stateDown.is(Blocks.BARRIER)) {
            if (!stateDown.is(Blocks.HONEY_BLOCK) && !stateDown.is(Blocks.SOUL_SAND)) {
                return Block.isFaceFull(stateDown.getCollisionShape(world, pos.below()), Direction.UP) || stateDown.getBlock() == this && stateDown.getValue(LAYERS) == 8;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    @Override
    @Nonnull
    public BlockState updateShape(BlockState state, @Nonnull Direction direction, @Nonnull BlockState facingState, @Nonnull LevelAccessor world, @Nonnull BlockPos currentPos, @Nonnull BlockPos facingPos) {
        return !state.canSurvive(world, currentPos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, direction, facingState, world, currentPos, facingPos);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        int layers = state.getValue(LAYERS);
        if (useContext.getItemInHand().getItem() == this.asItem() && layers < 8) {
            if (useContext.replacingClickedOnBlock()) {
                return useContext.getClickedFace() == Direction.UP;
            } else {
                return true;
            }
        } else {
            return layers < 4;
        }
    }
    
    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = context.getLevel().getBlockState(context.getClickedPos());
        if (state.getBlock() == this) {
            int layer = state.getValue(LAYERS);
            return layer == 7 ? AtumBlocks.SAND.get().defaultBlockState() : state.setValue(LAYERS, Math.min(7, layer + 1));
        } else {
            return super.getStateForPlacement(context);
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> container) {
        container.add(LAYERS);
    }
}