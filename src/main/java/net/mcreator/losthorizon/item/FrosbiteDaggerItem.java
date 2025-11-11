package net.mcreator.losthorizon.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.losthorizon.procedures.FrosbiteDaggerQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;
import net.mcreator.losthorizon.procedures.FrosbiteDaggerQuandLeBlocEstDetruitAvecLoutilProcedure;

public class FrosbiteDaggerItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 350, 6f, 0, 2, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:frostbite_dagger_repair_items")));

	public FrosbiteDaggerItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 3.5f, -1.5f));
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		FrosbiteDaggerQuandLeBlocEstDetruitAvecLoutilProcedure.execute(blockstate, entity);
		return retval;
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		FrosbiteDaggerQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}