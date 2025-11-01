package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.losthorizon.procedures.DestinyDiceEvenementAuClicDroitDansLairProcedure;

import java.util.function.Consumer;

public class DestinyDiceItem extends Item {
	public DestinyDiceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(10));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.destiny_dice.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.destiny_dice.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.destiny_dice.description_2"));
		componentConsumer.accept(Component.translatable("item.losthorizon.destiny_dice.description_3"));
		componentConsumer.accept(Component.translatable("item.losthorizon.destiny_dice.description_4"));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		DestinyDiceEvenementAuClicDroitDansLairProcedure.execute(world, entity, entity.getItemInHand(hand));
		return ar;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		DestinyDiceEvenementAuClicDroitDansLairProcedure.execute(context.getLevel(), context.getPlayer(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}