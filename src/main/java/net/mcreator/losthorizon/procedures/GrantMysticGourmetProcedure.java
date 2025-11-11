package net.mcreator.losthorizon.procedures;

import net.neoforged.neoforge.event.entity.player.AdvancementEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import javax.annotation.Nullable;

@EventBusSubscriber
public class GrantMysticGourmetProcedure {
	@SubscribeEvent
	public static void onAdvancement(AdvancementEvent.AdvancementEarnEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel _serverLevel0
				&& _plr0.getAdvancements().getOrStartProgress(_serverLevel0.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:healing_sweetness"))).isDone() && entity instanceof ServerPlayer _plr1
				&& _plr1.level() instanceof ServerLevel _serverLevel1 && _plr1.getAdvancements().getOrStartProgress(_serverLevel1.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:heart_of_ice"))).isDone()
				&& entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel _serverLevel2
				&& _plr2.getAdvancements().getOrStartProgress(_serverLevel2.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:travelers_provisions"))).isDone() && entity instanceof ServerPlayer _plr3
				&& _plr3.level() instanceof ServerLevel _serverLevel3 && _plr3.getAdvancements().getOrStartProgress(_serverLevel3.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:willing_corruption"))).isDone()
				&& entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel _serverLevel4
				&& _plr4.getAdvancements().getOrStartProgress(_serverLevel4.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:inner_thunder"))).isDone() && entity instanceof ServerPlayer _plr5
				&& _plr5.level() instanceof ServerLevel _serverLevel5 && _plr5.getAdvancements().getOrStartProgress(_serverLevel5.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:feast_of_the_gods"))).isDone()) {
			if (entity instanceof ServerPlayer _player && _player.level() instanceof ServerLevel _level) {
				AdvancementHolder _adv = _level.getServer().getAdvancements().get(ResourceLocation.parse("losthorizon:mystic_gourmet"));
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