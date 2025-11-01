package net.mcreator.losthorizon.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.losthorizon.procedures.HeartActivatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure;

import java.util.function.Consumer;

public class HeartActivatorItem extends Item {
	public HeartActivatorItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).durability(10));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.heart_activator.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.heart_activator.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.heart_activator.description_2"));
		componentConsumer.accept(Component.translatable("item.losthorizon.heart_activator.description_3"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		HeartActivatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}