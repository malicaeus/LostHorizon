package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class TechnobladeTotemItem extends Item {
	public TechnobladeTotemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(1).fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.technoblade_totem.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.technoblade_totem.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.technoblade_totem.description_2"));
	}
}