package net.mcreator.losthorizon.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.losthorizon.init.LosthorizonModItems;

public class HeartGuardianQuandLentiteMeurtProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (true == HeartGuardianIsActivateProcedure.execute(entity)) {
			if (sourceentity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LosthorizonModItems.HEART_LINK.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}