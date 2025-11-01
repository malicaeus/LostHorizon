package net.mcreator.losthorizon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MythrilEnchantedAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.5f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:mythril_enchanted_axe_repair_items")));

	public MythrilEnchantedAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8.5f, -3f, properties);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}