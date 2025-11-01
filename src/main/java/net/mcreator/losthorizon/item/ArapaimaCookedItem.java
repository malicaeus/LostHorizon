package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ArapaimaCookedItem extends Item {
	public ArapaimaCookedItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(6).saturationModifier(7.2f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}