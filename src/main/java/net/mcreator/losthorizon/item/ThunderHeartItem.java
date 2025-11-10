package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.ThunderHeartLeJoueurTermineDutiliserLitemProcedure;

public class ThunderHeartItem extends Item {
	public ThunderHeartItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(8).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(0.5F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		ThunderHeartLeJoueurTermineDutiliserLitemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}