package net.mcreator.losthorizon.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.losthorizon.entity.NecromancerBossEntity;
import net.mcreator.losthorizon.entity.HeartGuardianEntity;
import net.mcreator.losthorizon.entity.CryptGuardianEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class FightingOnTheEdgeGrantProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof Player || sourceentity instanceof ServerPlayer) && (entity instanceof NecromancerBossEntity || entity instanceof CryptGuardianEntity || entity instanceof HeartGuardianEntity)) {
			if (4 >= (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) && sourceentity instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(MobEffects.HUNGER) && sourceentity instanceof LivingEntity _livEnt7
					&& _livEnt7.hasEffect(MobEffects.STRENGTH)) {
				if (!(sourceentity instanceof ServerPlayer _plr8 && _plr8.level() instanceof ServerLevel _serverLevel8
						&& _plr8.getAdvancements().getOrStartProgress(_serverLevel8.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:fighting_on_the_edge"))).isDone())) {
					if (sourceentity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
						AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:fighting_on_the_edge"));
						if (_adv != null) {
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								for (String criteria : _ap.getRemainingCriteria())
									_player.getAdvancements().award(_adv, criteria);
							}
						}
					}
				}
			}
		}
	}
}