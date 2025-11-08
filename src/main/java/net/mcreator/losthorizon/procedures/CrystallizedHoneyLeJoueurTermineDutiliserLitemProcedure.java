package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class CrystallizedHoneyLeJoueurTermineDutiliserLitemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean effetaretirer = false;
		effetaretirer = true;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WEAKNESS) && Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WEAKNESS);
		}
		if (entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.DARKNESS) && Mth.nextInt(RandomSource.create(), 1, 10) < 5) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.DARKNESS);
		}
		if (entity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.BLINDNESS) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BLINDNESS);
		}
		if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(MobEffects.NAUSEA) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.NAUSEA);
		}
		if (entity instanceof LivingEntity _livEnt12 && _livEnt12.hasEffect(MobEffects.WITHER) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.WITHER);
		}
		if (entity instanceof LivingEntity _livEnt15 && _livEnt15.hasEffect(MobEffects.MINING_FATIGUE) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.MINING_FATIGUE);
		}
		if (entity instanceof LivingEntity _livEnt18 && _livEnt18.hasEffect(MobEffects.SLOWNESS) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.SLOWNESS);
		}
		if (entity instanceof LivingEntity _livEnt21 && _livEnt21.hasEffect(MobEffects.POISON) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.POISON);
		}
		if (entity instanceof LivingEntity _livEnt24 && _livEnt24.hasEffect(MobEffects.UNLUCK) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.UNLUCK);
		}
		if (entity instanceof LivingEntity _livEnt27 && _livEnt27.hasEffect(MobEffects.BAD_OMEN) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.BAD_OMEN);
		}
		if (entity instanceof LivingEntity _livEnt30 && _livEnt30.hasEffect(MobEffects.HUNGER) && Mth.nextInt(RandomSource.create(), 1, 10) < 5 && effetaretirer == true) {
			effetaretirer = false;
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MobEffects.HUNGER);
		}
		if (effetaretirer == false) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.honey_bottle.drink")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("item.honey_bottle.drink")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HEART, x, y, z, 100, 2, 3, 2, 0.2);
		}
	}
}