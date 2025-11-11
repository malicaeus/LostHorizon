package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;

import net.mcreator.losthorizon.init.LosthorizonModBlocks;

public class MythrilOreQuandLeBlocEstDetruitParUnJoueurProcedure {
	public static void execute(LevelAccessor world) {
		if (0 == world.dimensionType().moonPhase(world.dayTime())) {
			new ItemStack(LosthorizonModBlocks.MYTHRIL_ORE.get()).grow(1);
		}
	}
}