package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.RunicAmbrosiaLeJoueurTermineDutiliserLitemProcedure;

public class RunicAmbrosiaItem extends Item {
	public RunicAmbrosiaItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(8).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(2f).build(), Consumables.defaultFood().consumeSeconds(2F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		RunicAmbrosiaLeJoueurTermineDutiliserLitemProcedure.execute(entity);
		return retval;
	}
}