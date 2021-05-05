package com.teammetallurgy.atum.world.gen.feature.pool;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.teammetallurgy.atum.Atum;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.template.ProcessorLists;

public class GenericVillagePools {
    public static final JigsawPattern POOL = JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/town_centers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("atum:village/generic/town_centers/town_center_1", ProcessorLists.field_244101_a), 60), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/town_centers/town_center_2", ProcessorLists.field_244101_a), 40)), JigsawPattern.PlacementBehaviour.RIGID));

    public static void init() {
        ResourceLocation terminators = new ResourceLocation(Atum.MOD_ID, "village/generic/terminators");
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/streets"), terminators, ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/straight_1"), 5), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/fourway_1"), 3), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/threeway_1"), 3), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/turn_1"), 3), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/streets/turn_2"), 3)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/houses"), terminators, ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_2", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_3", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_4", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_5", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_6", ProcessorLists.field_244101_a), 1), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_7", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/generic_small_house_8", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/animal_pen_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/farm_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/farm_2", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/farm_3", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/market_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/palm_grove_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/wolf_kennel_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/quail_coop_1", ProcessorLists.field_244101_a), 1), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/alchemist", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/armorsmith", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/butcher", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/cartographer", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/curator", ProcessorLists.field_244101_a), 1), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/fletcher", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/glassblower", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/hunter", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/tailor", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/librarian", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/houses/weaponsmith", ProcessorLists.field_244101_a), 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/market_stalls"), terminators, ImmutableList.of(Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_1", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_2", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_3", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_4", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_5", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_6", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_7", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_8", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_9", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_10", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_11", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_12", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_13", ProcessorLists.field_244101_a), 2), Pair.of(JigsawPiece.func_242851_a("atum:village/generic/market_stalls/market_stall_14", ProcessorLists.field_244101_a), 2)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(terminators, new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/terminators/terminator_1"), 1)), JigsawPattern.PlacementBehaviour.TERRAIN_MATCHING));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/decor"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/decor/torch_1"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/decor/torch_2"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/decor/torch_3"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/decor/torch_4"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/decor/tree_1"), 1), Pair.of(JigsawPiece.func_242864_g(), 10)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/villagers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_human_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_human_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_human_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_human_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_human_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_human_female"), 15)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/camels"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/animals/camel"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/quails"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/animals/quail"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/desert_wolfs"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/animals/desert_wolf"), 10), Pair.of(JigsawPiece.func_242849_a("atum:village/animals/alpha_desert_wolf"), 1)), JigsawPattern.PlacementBehaviour.RIGID));
        //JigsawPatternRegistry.func_244094_a(new JigsawPattern(new ResourceLocation(Atum.MOD_ID, "village/generic/villagers"), new ResourceLocation("empty"), ImmutableList.of(Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_human_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_human_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_efreet_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_efreet_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_shabti_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_shabti_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_sylph_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_sylph_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_avi_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_avi_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_sphinx_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/nitwit_sphinx_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_human_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_human_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_efreet_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_efreet_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_shabti_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_shabti_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_sylph_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_sylph_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_avi_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_avi_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_sphinx_male"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/baby_sphinx_female"), 1), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_human_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_human_female"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_efreet_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_efreet_female"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_shabti_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_shabti_female"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_sylph_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_sylph_female"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_avi_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_avi_female"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_sphinx_male"), 15), Pair.of(JigsawPiece.func_242849_a("atum:village/generic/villagers/unemployed_sphinx_female"), 15)), JigsawPattern.PlacementBehaviour.RIGID));
    }
}