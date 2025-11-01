package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RedBelliedPiranhaCookedItem extends Item {
	public RedBelliedPiranhaCookedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(5f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}