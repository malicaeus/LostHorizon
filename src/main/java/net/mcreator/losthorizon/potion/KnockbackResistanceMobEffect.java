package net.mcreator.losthorizon.potion;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.losthorizon.LosthorizonMod;

public class KnockbackResistanceMobEffect extends MobEffect {
	public KnockbackResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
		this.addAttributeModifier(Attributes.KNOCKBACK_RESISTANCE, ResourceLocation.fromNamespaceAndPath(LosthorizonMod.MODID, "effect.knockback_resistance_0"), 1, AttributeModifier.Operation.ADD_VALUE);
	}
}