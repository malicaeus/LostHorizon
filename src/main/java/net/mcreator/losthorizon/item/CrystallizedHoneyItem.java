package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.CrystallizedHoneyLeJoueurTermineDutiliserLitemProcedure;

public class CrystallizedHoneyItem extends Item {
	public CrystallizedHoneyItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(16).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.5f).alwaysEdible().build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		CrystallizedHoneyLeJoueurTermineDutiliserLitemProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}