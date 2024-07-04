package net.magicmikey6.sew.item;

import net.magicmikey6.sew.Sew;
import net.magicmikey6.sew.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Sew.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SEW_TAB = CREATIVE_MODE_TABS.register("sew_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLOTH.get()))
                    .title(Component.translatable("creativetab.sew_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.CLOTH.get());
                        output.accept(ModItems.NEEDLE.get());
                        output.accept(ModItems.COTTON.get());
                        output.accept(ModItems.COTTON_SEEDS.get());

                        output.accept(ModBlocks.ENRICHED_PLANKS.get());

                        output.accept(ModBlocks.BASIC_SEWING_TABLE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
