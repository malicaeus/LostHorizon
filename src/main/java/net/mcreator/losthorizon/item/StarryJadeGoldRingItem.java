package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.function.Consumer;

public class StarryJadeGoldRingItem extends Item {
	public StarryJadeGoldRingItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.starry_jade_gold_ring.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.starry_jade_gold_ring.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.starry_jade_gold_ring.description_2"));
		componentConsumer.accept(Component.translatable("item.losthorizon.starry_jade_gold_ring.description_3"));
	}
}