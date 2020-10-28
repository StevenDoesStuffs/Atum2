package com.teammetallurgy.atum.init;

import com.google.common.collect.ImmutableSet;
import com.teammetallurgy.atum.Atum;
import com.teammetallurgy.atum.blocks.wood.DeadwoodLogBlock;
import com.teammetallurgy.atum.world.gen.feature.*;
import com.teammetallurgy.atum.world.gen.feature.tree.AtumTreeFeature;
import com.teammetallurgy.atum.world.gen.feature.tree.PalmFoliagePlacer;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.blockplacer.ColumnBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.AcaciaFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Atum.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AtumFeatures {
    private static final List<Feature<?>> FEATURES = new ArrayList<>();
    //Features
    public static final Feature<BlockStateFeatureConfig> SURFACE_LAVA_LAKE = register("surface_lava_lake", new LakeFeature(BlockStateFeatureConfig.field_236455_a_)); //TODO Try to generate again. Was not working in 1.15.2
    public static final Feature<BaseTreeFeatureConfig> ATUM_TREE = register("atum_tree", new AtumTreeFeature(BaseTreeFeatureConfig.CODEC));
    public static final BonusCrateFeature BONUS_CRATE = register("bonus_crate", new BonusCrateFeature(NoFeatureConfig.field_236558_a_));
    public static final StartStructureFeature START_STRUCTURE = register("start_structure", new StartStructureFeature(NoFeatureConfig.field_236558_a_));
    public static final DirtyBoneFossilsFeature DIRTY_BONE_FOSSILS = register("dirty_bone_fossil", new DirtyBoneFossilsFeature(NoFeatureConfig.field_236558_a_));
    public static final LimestoneDungeonsFeature LIMESTONE_DUNGEONS = register("limestone_dungeon", new LimestoneDungeonsFeature(NoFeatureConfig.field_236558_a_));
    public static final DeadwoodFeature DEADWOOD_FEATURE = register("deadwood_tree", new DeadwoodFeature(NoFeatureConfig.field_236558_a_));
    public static final Feature<NoFeatureConfig> LIMESTONE_SPIKE = register("limestone_spike", new LimestoneSpikeFeature(NoFeatureConfig.field_236558_a_));
    public static final Feature<BlockClusterFeatureConfig> ANPUTS_FINGERS = register("anputs_fingers", new AnputsFingersFeature(BlockClusterFeatureConfig.field_236587_a_));
    public static final Feature<NoFeatureConfig> SAND_LAYER = register("sand_layer", new SandLayerFeature(NoFeatureConfig.field_236558_a_));

    //Feature Configs
    public static final BlockClusterFeatureConfig OASIS_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.OASIS_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(30).build();
    public static final BlockClusterFeatureConfig DEAD_GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.DEAD_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(2).build();
    public static final BlockClusterFeatureConfig ANPUTS_FINGERS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.ANPUTS_FINGERS.getDefaultState()), new SimpleBlockPlacer())).build();
    public static final BlockClusterFeatureConfig PAPYRUS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.PAPYRUS.getDefaultState()), new ColumnBlockPlacer(1, 2))).tries(32).xSpread(2).ySpread(0).zSpread(2).func_227317_b_().requiresWater().build();
    public static final BaseTreeFeatureConfig PALM_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.PALM_LOG.getDefaultState()), new SimpleBlockStateProvider(AtumBlocks.PALM_LEAVES.getDefaultState()), new PalmFoliagePlacer(0.1F), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(0, 0, 0))).setIgnoreVines()/*.ophidianTongue(0.6D)*/.build(); //TODO
    public static final BaseTreeFeatureConfig PALM_TREE_CONFIG_SAPLING = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.PALM_LOG.getDefaultState()), new SimpleBlockStateProvider(AtumBlocks.PALM_LEAVES.getDefaultState()), new PalmFoliagePlacer(0.1F), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(0, 0, 0))).setIgnoreVines()/*.ophidianTongue(0.0D)*/.build(); //TODO
    public static final BaseTreeFeatureConfig DEAD_PALM_TREE_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.DEADWOOD_LOG.getDefaultState().with(DeadwoodLogBlock.HAS_SCARAB, true)), new SimpleBlockStateProvider(AtumBlocks.DEADWOOD_LEAVES.getDefaultState()), new PalmFoliagePlacer(0.0F), new StraightTrunkPlacer(5, 2, 1), new TwoLayerFeature(0, 0, 0))).setIgnoreVines()/*.ophidianTongue(0.0D)*/.build(); //TODO
    public static final LiquidsConfig WATER_SPRING_CONFIG = new LiquidsConfig(Fluids.WATER.getDefaultState(), true, 4, 1, ImmutableSet.of(AtumBlocks.LIMESTONE));
    public static final LiquidsConfig LAVA_SPRING_CONFIG = new LiquidsConfig(Fluids.LAVA.getDefaultState(), true, 4, 1, ImmutableSet.of(AtumBlocks.LIMESTONE));
    public static final BlockClusterFeatureConfig SHRUB_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.SHRUB.getDefaultState()), new SimpleBlockPlacer())).tries(3).build();
    public static final BlockClusterFeatureConfig WEED_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(AtumBlocks.WEED.getDefaultState()), new SimpleBlockPlacer())).tries(3).build();

    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        feature.setRegistryName(new ResourceLocation(Atum.MOD_ID, name));
        FEATURES.add(feature);
        return feature;
    }

    @SubscribeEvent
    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
        for (Feature<?> feature : FEATURES) {
            event.getRegistry().register(feature);
        }
    }
}