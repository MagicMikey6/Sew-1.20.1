package net.magicmikey6.sew.item;

import net.magicmikey6.sew.Sew;
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

    public static final RegistryObject<CreativeModeTab> SOW_TAB = CREATIVE_MODE_TABS.register("sow_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CLOTH.get()))
                    .title(Component.translatable("creativetab.sew_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.CLOTH.get());
                        output.accept(ModItems.NEEDLE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
