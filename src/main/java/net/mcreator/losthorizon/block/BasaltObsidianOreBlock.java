package net.mcreator.losthorizon.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.losthorizon.procedures.BasaltObsidianOreQuandLeBlocEstDetruitParUnJoueurProcedure;
import net.mcreator.losthorizon.init.LosthorizonModBlocks;

import java.util.function.Consumer;

public class BasaltObsidianOreBlock extends Block {
	public BasaltObsidianOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_ORE).strength(20f, 2000f).lightLevel(s -> 2).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}

	@Override
	public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
		boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
		BasaltObsidianOreQuandLeBlocEstDetruitParUnJoueurProcedure.execute(entity);
		return retval;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		BasaltObsidianOreQuandLeBlocEstDetruitParUnJoueurProcedure.execute(entity);
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(LosthorizonModBlocks.BASALT_OBSIDIAN_ORE.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.losthorizon.basalt_obsidian_ore.description_0"));
			componentConsumer.accept(Component.translatable("block.losthorizon.basalt_obsidian_ore.description_1"));
		}
	}
}