package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;

import net.mcreator.losthorizon.procedures.EmeraldGoldRingQuandLitemEstDansLinventaireParTickProcedure;

import javax.annotation.Nullable;

import java.util.function.Consumer;

public class EmeraldGoldRingItem extends Item {
	public EmeraldGoldRingItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(1));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.emerald_gold_ring.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.emerald_gold_ring.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.emerald_gold_ring.description_2"));
		componentConsumer.accept(Component.translatable("item.losthorizon.emerald_gold_ring.description_3"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		EmeraldGoldRingQuandLitemEstDansLinventaireParTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}