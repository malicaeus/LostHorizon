package net.mcreator.losthorizon.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.losthorizon.procedures.BasaltEdgeQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;

public class BasaltEdgeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1800, 10f, 0, 17, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:basalt_edge_repair_items")));

	public BasaltEdgeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -2.3f));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		BasaltEdgeQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}