package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.losthorizon.init.LosthorizonModItems;
import net.mcreator.losthorizon.entity.NecromancerBossEntity;

public class NecromancerMeleeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 40) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack1 = new ItemStack(LosthorizonModItems.FROSTBITE_DAGGER.get()).copy();
				_setstack1.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof NecromancerBossEntity _datEntSetL)
				_datEntSetL.getEntityData().set(NecromancerBossEntity.DATA_attack, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 120, 1));
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 70) {
			NecromancerDashProcedure.execute(entity);
			if (entity instanceof NecromancerBossEntity _datEntSetL)
				_datEntSetL.getEntityData().set(NecromancerBossEntity.DATA_attack, true);
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 100) {
			if (entity instanceof NecromancerBossEntity _datEntSetL)
				_datEntSetL.getEntityData().set(NecromancerBossEntity.DATA_attack, true);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack8 = new ItemStack(Blocks.AIR).copy();
				_setstack8.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack8);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 100, 3));
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 150) {
			NecromancerRandomProcedure.execute(world, x, y, z, entity);
		}
	}
}