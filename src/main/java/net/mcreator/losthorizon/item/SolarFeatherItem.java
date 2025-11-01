package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.losthorizon.procedures.SolarFeatherQuandLitemEstDansLinventaireParTickProcedure;
import net.mcreator.losthorizon.procedures.SolarFeatherEvenementAuClicDroitDansLairProcedure;

import javax.annotation.Nullable;

import java.util.function.Consumer;

public class SolarFeatherItem extends Item {
	public SolarFeatherItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).durability(10));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.solar_feather.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.solar_feather.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.solar_feather.description_2"));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		SolarFeatherEvenementAuClicDroitDansLairProcedure.execute(world, entity, entity.getItemInHand(hand));
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		SolarFeatherQuandLitemEstDansLinventaireParTickProcedure.execute(world, entity, itemstack);
	}
}