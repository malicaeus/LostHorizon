package net.mcreator.losthorizon.item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.losthorizon.procedures.EclipseBladeQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;

import java.util.function.Consumer;

public class EclipseBladeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2100, 8f, 0, 12, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:eclipse_blade_repair_items")));

	public EclipseBladeItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 4f, -2f).fireResistant());
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		EclipseBladeQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, sourceentity);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.eclipse_blade.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.eclipse_blade.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.eclipse_blade.description_2"));
	}
}