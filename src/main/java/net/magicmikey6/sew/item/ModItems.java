package net.magicmikey6.sew.item;

import net.magicmikey6.sew.Sew;
import net.magicmikey6.sew.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Sew.MOD_ID);

    public static final RegistryObject<Item> CLOTH = ITEMS.register("cloth",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NEEDLE = ITEMS.register("needle",
            () -> new NeedleItem(new Item.Properties().durability(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
