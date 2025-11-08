/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.losthorizon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.losthorizon.item.inventory.BackPackInventoryCapability;
import net.mcreator.losthorizon.item.inventory.BackPackExtendedInventoryCapability;
import net.mcreator.losthorizon.item.*;
import net.mcreator.losthorizon.block.NecromancerGrimoireBlocBlock;
import net.mcreator.losthorizon.block.BasaltObsidianOreBlock;
import net.mcreator.losthorizon.LosthorizonMod;

import java.util.function.Function;

@EventBusSubscriber
public class LosthorizonModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LosthorizonMod.MODID);
	public static final DeferredItem<Item> FROSTBITE_DAGGER;
	public static final DeferredItem<Item> KNIFE;
	public static final DeferredItem<Item> ONYX;
	public static final DeferredItem<Item> ONYX_ORE;
	public static final DeferredItem<Item> ONYX_BLOCK;
	public static final DeferredItem<Item> ONYX_KNIFE;
	public static final DeferredItem<Item> TOTEM_OF_THE_MOON;
	public static final DeferredItem<Item> LANTERN_SHIELD;
	public static final DeferredItem<Item> RUNITE_INGOT;
	public static final DeferredItem<Item> RUNITE_ORE;
	public static final DeferredItem<Item> RUNITE_BLOCK;
	public static final DeferredItem<Item> RUNITE_PICKAXE;
	public static final DeferredItem<Item> RUNITE_AXE;
	public static final DeferredItem<Item> RUNITE_SWORD;
	public static final DeferredItem<Item> RUNITE_SHOVEL;
	public static final DeferredItem<Item> RUNITE_HOE;
	public static final DeferredItem<Item> RUNITE_ARMOR_HELMET;
	public static final DeferredItem<Item> RUNITE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> RUNITE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> RUNITE_ARMOR_BOOTS;
	public static final DeferredItem<Item> ICE_CRYSTAL;
	public static final DeferredItem<Item> MYTHRIL;
	public static final DeferredItem<Item> MYTHRIL_ORE;
	public static final DeferredItem<Item> MYTHRIL_BLOCK;
	public static final DeferredItem<Item> MYTHRIL_PICKAXE;
	public static final DeferredItem<Item> MYTHRIL_AXE;
	public static final DeferredItem<Item> MYTHRIL_SWORD;
	public static final DeferredItem<Item> MYTHRIL_SHOVEL;
	public static final DeferredItem<Item> MYTHRIL_HOE;
	public static final DeferredItem<Item> MYTHRIL_ARMOR_HELMET;
	public static final DeferredItem<Item> MYTHRIL_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> MYTHRIL_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> MYTHRIL_ARMOR_BOOTS;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_PICKAXE;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_AXE;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_SWORD;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_SHOVEL;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_HOE;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_ARMOR_HELMET;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> MYTHRIL_ENCHANTED_ARMOR_BOOTS;
	public static final DeferredItem<Item> BASALT_OBSIDIAN_ORE;
	public static final DeferredItem<Item> BASALT_EDGE;
	public static final DeferredItem<Item> BACK_PACK;
	public static final DeferredItem<Item> BACK_PACK_EXTENDED;
	public static final DeferredItem<Item> CLIMBING_PICK;
	public static final DeferredItem<Item> RED_GROUPER_RAW;
	public static final DeferredItem<Item> RED_GROUPER_COOKED;
	public static final DeferredItem<Item> RED_BELLIED_PIRANHA_RAW;
	public static final DeferredItem<Item> RED_BELLIED_PIRANHA_COOKED;
	public static final DeferredItem<Item> ARAPAIMA_RAW;
	public static final DeferredItem<Item> ARAPAIMA_COOKED;
	public static final DeferredItem<Item> TECHNOBLADE_TOTEM;
	public static final DeferredItem<Item> ANCHOR_TOTEM;
	public static final DeferredItem<Item> TRAP;
	public static final DeferredItem<Item> NECROMANCER_GRIMOIRE_BLOCK;
	public static final DeferredItem<Item> NECROMANCER_SPAWN_EGG;
	public static final DeferredItem<Item> CRYPT_GUARDIAN_SPAWN_EGG;
	public static final DeferredItem<Item> NECROMANCER_GRIMOIRE;
	public static final DeferredItem<Item> MAGIC_WOOD;
	public static final DeferredItem<Item> MAGIC_LOG;
	public static final DeferredItem<Item> MAGIC_PLANKS;
	public static final DeferredItem<Item> MAGIC_LEAVES;
	public static final DeferredItem<Item> MAGIC_STAIRS;
	public static final DeferredItem<Item> MAGIC_SLAB;
	public static final DeferredItem<Item> MAGIC_FENCE;
	public static final DeferredItem<Item> MAGIC_FENCE_GATE;
	public static final DeferredItem<Item> MAGIC_PRESSURE_PLATE;
	public static final DeferredItem<Item> MAGIC_BUTTON;
	public static final DeferredItem<Item> LUMINOUS_BERRIES;
	public static final DeferredItem<Item> ENCHANTED_BLOSSOM;
	public static final DeferredItem<Item> SUSPICIOUS_STEW_ENCHANTED_BLOSSUM;
	public static final DeferredItem<Item> RING_INFUSER;
	public static final DeferredItem<Item> GOLD_RING;
	public static final DeferredItem<Item> IRON_RING;
	public static final DeferredItem<Item> ICE_CRYSTAL_GOLD_RING;
	public static final DeferredItem<Item> ICE_CRYSTAL_IRON_RING;
	public static final DeferredItem<Item> MYTHRIL_GOLD_RING;
	public static final DeferredItem<Item> MYTHRIL_IRON_RING;
	public static final DeferredItem<Item> ONYX_GOLD_RING;
	public static final DeferredItem<Item> ONYX_IRON_RING;
	public static final DeferredItem<Item> EMERALD_GOLD_RING;
	public static final DeferredItem<Item> EMERALD_IRON_RING;
	public static final DeferredItem<Item> STARRY_JADE;
	public static final DeferredItem<Item> STARRY_JADE_ORE;
	public static final DeferredItem<Item> STARRY_JADE_BLOCK;
	public static final DeferredItem<Item> STARRY_JADE_RAW;
	public static final DeferredItem<Item> STARRY_JADE_GOLD_RING;
	public static final DeferredItem<Item> STARRY_JADE_IRON_RING;
	public static final DeferredItem<Item> DESTINY_DICE;
	public static final DeferredItem<Item> HEART_LINK;
	public static final DeferredItem<Item> LINK_DAGGER;
	public static final DeferredItem<Item> DEATH_SWORD;
	public static final DeferredItem<Item> LINKED_SPAWN_EGG;
	public static final DeferredItem<Item> HEART_GUARDIAN_SPAWN_EGG;
	public static final DeferredItem<Item> HEART_ACTIVATOR;
	public static final DeferredItem<Item> HEART_BLOCK;
	public static final DeferredItem<Item> SHARD_OF_THE_VOID;
	public static final DeferredItem<Item> SOLAR_FEATHER;
	public static final DeferredItem<Item> AETHER_HEART;
	public static final DeferredItem<Item> EYE_OF_HYPERION;
	public static final DeferredItem<Item> BLACK_BLAZE_SPAWN_EGG;
	public static final DeferredItem<Item> ECLIPSE_BLADE;
	public static final DeferredItem<Item> MOONBELL;
	public static final DeferredItem<Item> ASH_OF_DAWN;
	public static final DeferredItem<Item> LUNAR_SWORD;
	public static final DeferredItem<Item> CRYSTALLIZED_HONEY;
	static {
		FROSTBITE_DAGGER = register("frostbite_dagger", FrosbiteDaggerItem::new);
		KNIFE = register("knife", KnifeItem::new);
		ONYX = register("onyx", OnyxItem::new);
		ONYX_ORE = block(LosthorizonModBlocks.ONYX_ORE);
		ONYX_BLOCK = block(LosthorizonModBlocks.ONYX_BLOCK);
		ONYX_KNIFE = register("onyx_knife", OnyxKnifeItem::new);
		TOTEM_OF_THE_MOON = register("totem_of_the_moon", TotemOfTheMoonItem::new);
		LANTERN_SHIELD = register("lantern_shield", LanternShieldItem::new);
		RUNITE_INGOT = register("runite_ingot", RuniteIngotItem::new);
		RUNITE_ORE = block(LosthorizonModBlocks.RUNITE_ORE);
		RUNITE_BLOCK = block(LosthorizonModBlocks.RUNITE_BLOCK);
		RUNITE_PICKAXE = register("runite_pickaxe", RunitePickaxeItem::new);
		RUNITE_AXE = register("runite_axe", RuniteAxeItem::new);
		RUNITE_SWORD = register("runite_sword", RuniteSwordItem::new);
		RUNITE_SHOVEL = register("runite_shovel", RuniteShovelItem::new);
		RUNITE_HOE = register("runite_hoe", RuniteHoeItem::new);
		RUNITE_ARMOR_HELMET = register("runite_armor_helmet", RuniteArmorItem.Helmet::new);
		RUNITE_ARMOR_CHESTPLATE = register("runite_armor_chestplate", RuniteArmorItem.Chestplate::new);
		RUNITE_ARMOR_LEGGINGS = register("runite_armor_leggings", RuniteArmorItem.Leggings::new);
		RUNITE_ARMOR_BOOTS = register("runite_armor_boots", RuniteArmorItem.Boots::new);
		ICE_CRYSTAL = register("ice_crystal", IceCrystalItem::new);
		MYTHRIL = register("mythril", MythrilItem::new);
		MYTHRIL_ORE = block(LosthorizonModBlocks.MYTHRIL_ORE);
		MYTHRIL_BLOCK = block(LosthorizonModBlocks.MYTHRIL_BLOCK);
		MYTHRIL_PICKAXE = register("mythril_pickaxe", MythrilPickaxeItem::new);
		MYTHRIL_AXE = register("mythril_axe", MythrilAxeItem::new);
		MYTHRIL_SWORD = register("mythril_sword", MythrilSwordItem::new);
		MYTHRIL_SHOVEL = register("mythril_shovel", MythrilShovelItem::new);
		MYTHRIL_HOE = register("mythril_hoe", MythrilHoeItem::new);
		MYTHRIL_ARMOR_HELMET = register("mythril_armor_helmet", MythrilArmorItem.Helmet::new);
		MYTHRIL_ARMOR_CHESTPLATE = register("mythril_armor_chestplate", MythrilArmorItem.Chestplate::new);
		MYTHRIL_ARMOR_LEGGINGS = register("mythril_armor_leggings", MythrilArmorItem.Leggings::new);
		MYTHRIL_ARMOR_BOOTS = register("mythril_armor_boots", MythrilArmorItem.Boots::new);
		MYTHRIL_ENCHANTED_PICKAXE = register("mythril_enchanted_pickaxe", MythrilEnchantedPickaxeItem::new);
		MYTHRIL_ENCHANTED_AXE = register("mythril_enchanted_axe", MythrilEnchantedAxeItem::new);
		MYTHRIL_ENCHANTED_SWORD = register("mythril_enchanted_sword", MythrilEnchantedSwordItem::new);
		MYTHRIL_ENCHANTED_SHOVEL = register("mythril_enchanted_shovel", MythrilEnchantedShovelItem::new);
		MYTHRIL_ENCHANTED_HOE = register("mythril_enchanted_hoe", MythrilEnchantedHoeItem::new);
		MYTHRIL_ENCHANTED_ARMOR_HELMET = register("mythril_enchanted_armor_helmet", MythrilEnchantedArmorItem.Helmet::new);
		MYTHRIL_ENCHANTED_ARMOR_CHESTPLATE = register("mythril_enchanted_armor_chestplate", MythrilEnchantedArmorItem.Chestplate::new);
		MYTHRIL_ENCHANTED_ARMOR_LEGGINGS = register("mythril_enchanted_armor_leggings", MythrilEnchantedArmorItem.Leggings::new);
		MYTHRIL_ENCHANTED_ARMOR_BOOTS = register("mythril_enchanted_armor_boots", MythrilEnchantedArmorItem.Boots::new);
		BASALT_OBSIDIAN_ORE = register("basalt_obsidian_ore", BasaltObsidianOreBlock.Item::new);
		BASALT_EDGE = register("basalt_edge", BasaltEdgeItem::new);
		BACK_PACK = register("back_pack", BackPackItem::new);
		BACK_PACK_EXTENDED = register("back_pack_extended", BackPackExtendedItem::new);
		CLIMBING_PICK = register("climbing_pick", ClimbingPickItem::new);
		RED_GROUPER_RAW = register("red_grouper_raw", RedGrouperRawItem::new);
		RED_GROUPER_COOKED = register("red_grouper_cooked", RedGrouperCookedItem::new);
		RED_BELLIED_PIRANHA_RAW = register("red_bellied_piranha_raw", RedBelliedPiranhaRawItem::new);
		RED_BELLIED_PIRANHA_COOKED = register("red_bellied_piranha_cooked", RedBelliedPiranhaCookedItem::new);
		ARAPAIMA_RAW = register("arapaima_raw", ArapaimaRawItem::new);
		ARAPAIMA_COOKED = register("arapaima_cooked", ArapaimaCookedItem::new);
		TECHNOBLADE_TOTEM = register("technoblade_totem", TechnobladeTotemItem::new);
		ANCHOR_TOTEM = register("anchor_totem", AnchorTotemItem::new);
		TRAP = block(LosthorizonModBlocks.TRAP);
		NECROMANCER_GRIMOIRE_BLOCK = register("necromancer_grimoire_block", NecromancerGrimoireBlocBlock.Item::new);
		NECROMANCER_SPAWN_EGG = register("necromancer_spawn_egg", properties -> new SpawnEggItem(LosthorizonModEntities.NECROMANCER.get(), properties));
		CRYPT_GUARDIAN_SPAWN_EGG = register("crypt_guardian_spawn_egg", properties -> new SpawnEggItem(LosthorizonModEntities.CRYPT_GUARDIAN.get(), properties));
		NECROMANCER_GRIMOIRE = register("necromancer_grimoire", NecromancerGrimoireItem::new);
		MAGIC_WOOD = block(LosthorizonModBlocks.MAGIC_WOOD);
		MAGIC_LOG = block(LosthorizonModBlocks.MAGIC_LOG);
		MAGIC_PLANKS = block(LosthorizonModBlocks.MAGIC_PLANKS);
		MAGIC_LEAVES = block(LosthorizonModBlocks.MAGIC_LEAVES);
		MAGIC_STAIRS = block(LosthorizonModBlocks.MAGIC_STAIRS);
		MAGIC_SLAB = block(LosthorizonModBlocks.MAGIC_SLAB);
		MAGIC_FENCE = block(LosthorizonModBlocks.MAGIC_FENCE);
		MAGIC_FENCE_GATE = block(LosthorizonModBlocks.MAGIC_FENCE_GATE);
		MAGIC_PRESSURE_PLATE = block(LosthorizonModBlocks.MAGIC_PRESSURE_PLATE);
		MAGIC_BUTTON = block(LosthorizonModBlocks.MAGIC_BUTTON);
		LUMINOUS_BERRIES = register("luminous_berries", LuminousBerriesItem::new);
		ENCHANTED_BLOSSOM = block(LosthorizonModBlocks.ENCHANTED_BLOSSOM);
		SUSPICIOUS_STEW_ENCHANTED_BLOSSUM = register("suspicious_stew_enchanted_blossum", SuspiciousStewEnchantedBlossumItem::new);
		RING_INFUSER = block(LosthorizonModBlocks.RING_INFUSER);
		GOLD_RING = register("gold_ring", GoldRingItem::new);
		IRON_RING = register("iron_ring", SilverRingItem::new);
		ICE_CRYSTAL_GOLD_RING = register("ice_crystal_gold_ring", IceCrystalGoldRingItem::new);
		ICE_CRYSTAL_IRON_RING = register("ice_crystal_iron_ring", IceCrystalSilverRingItem::new);
		MYTHRIL_GOLD_RING = register("mythril_gold_ring", MythrilGoldRingItem::new);
		MYTHRIL_IRON_RING = register("mythril_iron_ring", MythrilSilverRingItem::new);
		ONYX_GOLD_RING = register("onyx_gold_ring", OnyxGoldRingItem::new);
		ONYX_IRON_RING = register("onyx_iron_ring", OnyxSilverRingItem::new);
		EMERALD_GOLD_RING = register("emerald_gold_ring", EmeraldGoldRingItem::new);
		EMERALD_IRON_RING = register("emerald_iron_ring", EmeraldIronRingItem::new);
		STARRY_JADE = register("starry_jade", StarryJadeItem::new);
		STARRY_JADE_ORE = block(LosthorizonModBlocks.STARRY_JADE_ORE);
		STARRY_JADE_BLOCK = block(LosthorizonModBlocks.STARRY_JADE_BLOCK);
		STARRY_JADE_RAW = register("starry_jade_raw", StarryJadeRawItem::new);
		STARRY_JADE_GOLD_RING = register("starry_jade_gold_ring", StarryJadeGoldRingItem::new);
		STARRY_JADE_IRON_RING = register("starry_jade_iron_ring", StarryJadeIronRingItem::new);
		DESTINY_DICE = register("destiny_dice", DestinyDiceItem::new);
		HEART_LINK = register("heart_link", HeartLinkItem::new);
		LINK_DAGGER = register("link_dagger", LinkDaggerItem::new);
		DEATH_SWORD = register("death_sword", DeathSwordItem::new);
		LINKED_SPAWN_EGG = register("linked_spawn_egg", properties -> new SpawnEggItem(LosthorizonModEntities.LINKED.get(), properties));
		HEART_GUARDIAN_SPAWN_EGG = register("heart_guardian_spawn_egg", properties -> new SpawnEggItem(LosthorizonModEntities.HEART_GUARDIAN.get(), properties));
		HEART_ACTIVATOR = register("heart_activator", HeartActivatorItem::new);
		HEART_BLOCK = block(LosthorizonModBlocks.HEART_BLOCK);
		SHARD_OF_THE_VOID = register("shard_of_the_void", ShardOfTheVoidItem::new);
		SOLAR_FEATHER = register("solar_feather", SolarFeatherItem::new);
		AETHER_HEART = register("aether_heart", AetherHeartItem::new);
		EYE_OF_HYPERION = register("eye_of_hyperion", EyeOfHyperionItem::new);
		BLACK_BLAZE_SPAWN_EGG = register("black_blaze_spawn_egg", properties -> new SpawnEggItem(LosthorizonModEntities.BLACK_BLAZE.get(), properties));
		ECLIPSE_BLADE = register("eclipse_blade", EclipseBladeItem::new);
		MOONBELL = register("moonbell", MoonbellItem::new);
		ASH_OF_DAWN = register("ash_of_dawn", AshOfDawnItem::new);
		LUNAR_SWORD = register("lunar_sword", LunarSwordItem::new);
		CRYSTALLIZED_HONEY = register("crystallized_honey", CrystallizedHoneyItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new BackPackInventoryCapability(stack), BACK_PACK.get());
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new BackPackExtendedInventoryCapability(stack), BACK_PACK_EXTENDED.get());
	}
}