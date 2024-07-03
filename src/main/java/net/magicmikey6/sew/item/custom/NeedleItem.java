package net.magicmikey6.sew.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NeedleItem extends Item {
    private final RandomSource random = RandomSource.create();

    public NeedleItem(Item.Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack damagedStack = itemStack.copy();
        if (damagedStack.hurt(1, random, null)) {
            return ItemStack.EMPTY;
        } else {
            return damagedStack;
        }
    }

    //Example Shift Hover Text:

    /*@Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.sew.needle.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.sew.needle.tooltip"));
        }
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }*/

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }
}
