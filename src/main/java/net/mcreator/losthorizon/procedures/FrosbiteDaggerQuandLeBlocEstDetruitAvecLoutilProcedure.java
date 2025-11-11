package net.mcreator.losthorizon.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.losthorizon.init.LosthorizonModItems;

public class FrosbiteDaggerQuandLeBlocEstDetruitAvecLoutilProcedure {
	public static void execute(BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (2 == Mth.nextInt(RandomSource.create(), 1, 5) && (Blocks.PACKED_ICE == blockstate.getBlock() || Blocks.FROSTED_ICE == blockstate.getBlock() || Blocks.BLUE_ICE == blockstate.getBlock())) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LosthorizonModItems.ICE_CRYSTAL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}