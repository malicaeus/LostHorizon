package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class RedBelliedPiranhaRawItem extends Item {
	public RedBelliedPiranhaRawItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}