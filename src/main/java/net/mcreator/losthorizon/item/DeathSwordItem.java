package net.mcreator.losthorizon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class DeathSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1000, 6f, 0, 14, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:death_sword_repair_items")));

	public DeathSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -3f));
	}
}