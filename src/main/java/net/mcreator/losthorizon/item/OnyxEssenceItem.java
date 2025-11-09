package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.OnyxEssenceLeJoueurTermineDutiliserLitemProcedure;

public class OnyxEssenceItem extends Item {
	public OnyxEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(8).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		OnyxEssenceLeJoueurTermineDutiliserLitemProcedure.execute(world, entity);
		return retval;
	}
}