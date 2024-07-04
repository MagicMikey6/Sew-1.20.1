package net.magicmikey6.sew.datagen.loot;

import net.magicmikey6.sew.block.ModBlocks;
import net.magicmikey6.sew.block.custom.*;
import net.magicmikey6.sew.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ENRICHED_PLANKS.get());
        this.dropSelf(ModBlocks.BASIC_SEWING_TABLE.get());

        LootItemCondition.Builder lootitemcondition$builder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.COTTON_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CottonCropBlock.AGE, 5));

        this.add(ModBlocks.COTTON_CROP.get(), createCropDrops(ModBlocks.COTTON_CROP.get(), ModItems.COTTON.get(),
                ModItems.COTTON_SEEDS.get(), lootitemcondition$builder));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
