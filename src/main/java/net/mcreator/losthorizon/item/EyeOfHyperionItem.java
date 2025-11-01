package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.losthorizon.procedures.EyeOfHyperionEvenementAuClicDroitDansLairProcedure;

import java.util.function.Consumer;

public class EyeOfHyperionItem extends Item {
	public EyeOfHyperionItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).durability(6));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.eye_of_hyperion.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.eye_of_hyperion.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.eye_of_hyperion.description_2"));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		EyeOfHyperionEvenementAuClicDroitDansLairProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity, entity.getItemInHand(hand));
		return ar;
	}
}