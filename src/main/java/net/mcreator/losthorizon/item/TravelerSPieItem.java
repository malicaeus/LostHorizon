package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.TravelerSPieLeJoueurTermineDutiliserLitemProcedure;

public class TravelerSPieItem extends Item {
	public TravelerSPieItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(8).saturationModifier(1.2f).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		TravelerSPieLeJoueurTermineDutiliserLitemProcedure.execute(entity);
		return retval;
	}
}