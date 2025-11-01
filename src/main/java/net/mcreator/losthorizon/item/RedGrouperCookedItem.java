package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RedGrouperCookedItem extends Item {
	public RedGrouperCookedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(6f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}