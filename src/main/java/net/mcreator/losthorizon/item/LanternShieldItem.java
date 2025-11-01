package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.BlocksAttacks;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import net.mcreator.losthorizon.procedures.LanternShieldLorsqueLoutilEstDansLaMainProcedure;

import javax.annotation.Nullable;

import java.util.Optional;
import java.util.List;

public class LanternShieldItem extends ShieldItem {
	public LanternShieldItem(Item.Properties properties) {
		super(properties.repairable(TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:lantern_shield_repair_items"))).component(DataComponents.BREAK_SOUND, SoundEvents.SHIELD_BREAK).equippableUnswappable(EquipmentSlot.OFFHAND)
				.component(DataComponents.BLOCKS_ATTACKS, new BlocksAttacks(0.25f, 1, List.of(new BlocksAttacks.DamageReduction(90.0f, Optional.empty(), 0, 1)), new BlocksAttacks.ItemDamageFunction(3, 1, 1),
						Optional.of(DamageTypeTags.BYPASSES_SHIELD), Optional.of(SoundEvents.SHIELD_BLOCK), Optional.of(SoundEvents.SHIELD_BREAK)))
				.durability(100));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, ServerLevel world, Entity entity, @Nullable EquipmentSlot equipmentSlot) {
		super.inventoryTick(itemstack, world, entity, equipmentSlot);
		LanternShieldLorsqueLoutilEstDansLaMainProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}