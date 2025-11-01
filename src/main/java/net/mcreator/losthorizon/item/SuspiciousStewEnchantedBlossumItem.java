package net.mcreator.losthorizon.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.losthorizon.procedures.SuspiciousStewEnchantedBlossumQuandLeJoueurACesseDutiliserProcedure;

public class SuspiciousStewEnchantedBlossumItem extends Item {
	public SuspiciousStewEnchantedBlossumItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(1).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build(), Consumables.DEFAULT_DRINK).usingConvertsTo(Items.BOWL));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		SuspiciousStewEnchantedBlossumQuandLeJoueurACesseDutiliserProcedure.execute(entity);
		return retval;
	}
}