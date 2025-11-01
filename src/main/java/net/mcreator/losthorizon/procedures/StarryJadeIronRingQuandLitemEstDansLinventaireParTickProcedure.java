package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.losthorizon.network.LosthorizonModVariables;
import net.mcreator.losthorizon.init.LosthorizonModItems;
import net.mcreator.losthorizon.LosthorizonMod;

public class StarryJadeIronRingQuandLitemEstDansLinventaireParTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.ICE_CRYSTAL_GOLD_RING.get())) && !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.ICE_CRYSTAL_IRON_RING.get()))
				&& !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.MYTHRIL_GOLD_RING.get())) && !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.MYTHRIL_IRON_RING.get()))
				&& !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.ONYX_GOLD_RING.get())) && !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.ONYX_IRON_RING.get()))
				&& !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.EMERALD_GOLD_RING.get())) && !hasEntityInInventory(entity, new ItemStack(LosthorizonModItems.EMERALD_IRON_RING.get()))) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < 10) {
				if (Mth.nextInt(RandomSource.create(), 1, 100) <= 25) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 200, 0, false, false));
				}
			}
			if (entity.getData(LosthorizonModVariables.PLAYER_VARIABLES).starry_jade_iron_rinh_cooldown == false) {
				{
					LosthorizonModVariables.PlayerVariables _vars = entity.getData(LosthorizonModVariables.PLAYER_VARIABLES);
					_vars.starry_jade_iron_rinh_cooldown = true;
					_vars.markSyncDirty();
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.LUCK, 600, 0, false, false));
				LosthorizonMod.queueServerWork(1800, () -> {
					{
						LosthorizonModVariables.PlayerVariables _vars = entity.getData(LosthorizonModVariables.PLAYER_VARIABLES);
						_vars.starry_jade_iron_rinh_cooldown = false;
						_vars.markSyncDirty();
					}
				});
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player)
			return player.getInventory().contains(stack -> !stack.isEmpty() && ItemStack.isSameItem(stack, itemstack));
		return false;
	}
}