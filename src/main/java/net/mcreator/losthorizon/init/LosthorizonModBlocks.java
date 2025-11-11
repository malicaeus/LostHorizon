/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.losthorizon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.losthorizon.block.*;
import net.mcreator.losthorizon.LosthorizonMod;

import java.util.function.Function;

public class LosthorizonModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LosthorizonMod.MODID);
	public static final DeferredBlock<Block> ONYX_ORE;
	public static final DeferredBlock<Block> ONYX_BLOCK;
	public static final DeferredBlock<Block> RUNITE_ORE;
	public static final DeferredBlock<Block> RUNITE_BLOCK;
	public static final DeferredBlock<Block> MYTHRIL_ORE;
	public static final DeferredBlock<Block> MYTHRIL_BLOCK;
	public static final DeferredBlock<Block> BASALT_OBSIDIAN_ORE;
	public static final DeferredBlock<Block> TRAP;
	public static final DeferredBlock<Block> NECROMANCER_GRIMOIRE_BLOCK;
	public static final DeferredBlock<Block> MAGIC_WOOD;
	public static final DeferredBlock<Block> MAGIC_LOG;
	public static final DeferredBlock<Block> MAGIC_PLANKS;
	public static final DeferredBlock<Block> MAGIC_LEAVES;
	public static final DeferredBlock<Block> MAGIC_STAIRS;
	public static final DeferredBlock<Block> MAGIC_SLAB;
	public static final DeferredBlock<Block> MAGIC_FENCE;
	public static final DeferredBlock<Block> MAGIC_FENCE_GATE;
	public static final DeferredBlock<Block> MAGIC_PRESSURE_PLATE;
	public static final DeferredBlock<Block> MAGIC_BUTTON;
	public static final DeferredBlock<Block> ENCHANTED_BLOSSOM;
	public static final DeferredBlock<Block> RING_INFUSER;
	public static final DeferredBlock<Block> STARRY_JADE_ORE;
	public static final DeferredBlock<Block> STARRY_JADE_BLOCK;
	public static final DeferredBlock<Block> HEART_BLOCK;
	public static final DeferredBlock<Block> MYSTICAL_MUSHROOMS_CROPS;
	static {
		ONYX_ORE = register("onyx_ore", OnyxOreBlock::new);
		ONYX_BLOCK = register("onyx_block", OnyxBlockBlock::new);
		RUNITE_ORE = register("runite_ore", RuniteOreBlock::new);
		RUNITE_BLOCK = register("runite_block", RuniteBlockBlock::new);
		MYTHRIL_ORE = register("mythril_ore", MythrilOreBlock::new);
		MYTHRIL_BLOCK = register("mythril_block", MythrilBlockBlock::new);
		BASALT_OBSIDIAN_ORE = register("basalt_obsidian_ore", BasaltObsidianOreBlock::new);
		TRAP = register("trap", TrapBlock::new);
		NECROMANCER_GRIMOIRE_BLOCK = register("necromancer_grimoire_block", NecromancerGrimoireBlocBlock::new);
		MAGIC_WOOD = register("magic_wood", MagicWoodBlock::new);
		MAGIC_LOG = register("magic_log", MagicLogBlock::new);
		MAGIC_PLANKS = register("magic_planks", MagicPlanksBlock::new);
		MAGIC_LEAVES = register("magic_leaves", MagicLeavesBlock::new);
		MAGIC_STAIRS = register("magic_stairs", MagicStairsBlock::new);
		MAGIC_SLAB = register("magic_slab", MagicSlabBlock::new);
		MAGIC_FENCE = register("magic_fence", MagicFenceBlock::new);
		MAGIC_FENCE_GATE = register("magic_fence_gate", MagicFenceGateBlock::new);
		MAGIC_PRESSURE_PLATE = register("magic_pressure_plate", MagicPressurePlateBlock::new);
		MAGIC_BUTTON = register("magic_button", MagicButtonBlock::new);
		ENCHANTED_BLOSSOM = register("enchanted_blossom", EnchantedBlossomBlock::new);
		RING_INFUSER = register("ring_infuser", RingInfuserBlock::new);
		STARRY_JADE_ORE = register("starry_jade_ore", StarryJadeOreBlock::new);
		STARRY_JADE_BLOCK = register("starry_jade_block", StarryJadeBlockBlock::new);
		HEART_BLOCK = register("heart_block", HeartBlockBlock::new);
		MYSTICAL_MUSHROOMS_CROPS = register("mystical_mushrooms_crops", MysticalMushroomsStage0Block::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}