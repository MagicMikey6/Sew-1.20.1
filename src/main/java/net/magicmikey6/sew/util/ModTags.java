package net.magicmikey6.sew.util;

import net.magicmikey6.sew.Sew;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Sew.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> NEEDLES = tag("needles");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Sew.MOD_ID, name));
        }
    }
}
