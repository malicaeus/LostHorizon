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

import net.mcreator.losthorizon.procedures.LunarSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure;

import java.util.function.Consumer;

public class LunarSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1600, 7f, 0, 11, TagKey.create(Registries.ITEM, ResourceLocation.parse("losthorizon:lunar_sword_repair_items")));

	public LunarSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 6f, -2.4f));
	}

	@Override
	public void hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		super.hurtEnemy(itemstack, entity, sourceentity);
		LunarSwordQuandUneEntiteVivanteEstFrappeeAvecLoutilProcedure.execute(entity);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.losthorizon.lunar_sword.description_0"));
		componentConsumer.accept(Component.translatable("item.losthorizon.lunar_sword.description_1"));
		componentConsumer.accept(Component.translatable("item.losthorizon.lunar_sword.description_2"));
	}
}