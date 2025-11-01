package net.mcreator.losthorizon.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.losthorizon.init.LosthorizonModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements LosthorizonModBiomes.LosthorizonModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> losthorizon_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.losthorizon_dimensionTypeReference != null) {
			retval = LosthorizonModBiomes.adaptSurfaceRule(retval, this.losthorizon_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setlosthorizonDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.losthorizon_dimensionTypeReference = dimensionType;
	}
}