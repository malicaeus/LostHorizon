package net.mcreator.losthorizon.procedures;

import net.minecraft.world.entity.Entity;

public class HeartGuardianQuandLentiteEstBlesseeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (true == HeartGuardianIsActivateProcedure.execute(entity)) {
			return true;
		}
		return false;
	}
}