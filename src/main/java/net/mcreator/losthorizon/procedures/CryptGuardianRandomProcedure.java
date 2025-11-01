package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class CryptGuardianRandomProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double StateSelector = 0;
		entity.getPersistentData().putString("PreviousPreviousState", (entity.getPersistentData().getStringOr("PreviousState", "")));
		entity.getPersistentData().putString("PreviousState", (entity.getPersistentData().getStringOr("State", "")));
		StateSelector = Mth.nextInt(RandomSource.create(), 0, 2);
		if (StateSelector == 0) {
			entity.getPersistentData().putString("State", "Melee");
		}
		if (StateSelector == 1) {
			entity.getPersistentData().putString("State", "Potion");
		}
		if (StateSelector == 2) {
			entity.getPersistentData().putString("State", "Regen");
		}
		if ((entity.getPersistentData().getStringOr("PreviousPreviousState", "")).equals("PreviousState") || (entity.getPersistentData().getStringOr("PreviousState", "")).equals("State")) {
			CryptGuardianRandomProcedure.execute(world, x, y, z, entity);
		}
	}
}