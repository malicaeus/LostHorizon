package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ArapaimaRawItem extends Item {
	public ArapaimaRawItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.6f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}