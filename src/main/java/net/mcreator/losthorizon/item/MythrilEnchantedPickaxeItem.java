package net.mcreator.losthorizon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class MythrilEnchantedPickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.5f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:mythril_enchanted_pickaxe_repair_items")));

	public MythrilEnchantedPickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 4.5f, -2.8f));
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}