package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;

import net.mcreator.losthorizon.init.LosthorizonModItems;
import net.mcreator.losthorizon.entity.CryptGuardianEntity;

public class CryptGuardianMeleeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 40) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack1 = new ItemStack(Items.IRON_AXE).copy();
				_setstack1.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack1);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof CryptGuardianEntity _datEntSetL)
				_datEntSetL.getEntityData().set(CryptGuardianEntity.DATA_attack, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 120, 1));
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 70) {
			CryptGuardianDashProcedure.execute(entity);
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 100) {
			if (entity instanceof CryptGuardianEntity _datEntSetL)
				_datEntSetL.getEntityData().set(CryptGuardianEntity.DATA_attack, false);
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack7 = new ItemStack(Blocks.AIR).copy();
				_setstack7.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack7);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SLOWNESS, 100, 3));
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 150) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack10 = new ItemStack(LosthorizonModItems.KNIFE.get()).copy();
				_setstack10.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack10);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof CryptGuardianEntity _datEntSetL)
				_datEntSetL.getEntityData().set(CryptGuardianEntity.DATA_attack, true);
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.SPEED, 120, 1));
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 200) {
			CryptGuardianRandomProcedure.execute(world, x, y, z, entity);
		}
	}
}