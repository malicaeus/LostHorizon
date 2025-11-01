package net.mcreator.losthorizon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MythrilEnchantedSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.5f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:mythril_enchanted_sword_repair_items")));

	public MythrilEnchantedSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6.5f, -2.4f));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}