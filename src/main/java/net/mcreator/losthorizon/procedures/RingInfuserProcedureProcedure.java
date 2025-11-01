package net.mcreator.losthorizon.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.losthorizon.init.LosthorizonModMenus;
import net.mcreator.losthorizon.init.LosthorizonModItems;

public class RingInfuserProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu0 ? _menu0.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.GOLD_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu2 ? _menu2.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.ICE_CRYSTAL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu4 ? _menu4.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu6 ? _menu6.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack11 = new ItemStack(LosthorizonModItems.ICE_CRYSTAL_GOLD_RING.get()).copy();
				_setstack11.setCount(1);
				_menu.getSlots().get(3).set(_setstack11);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu13 ? _menu13.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.IRON_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu15 ? _menu15.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.ICE_CRYSTAL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu17 ? _menu17.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu19 ? _menu19.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack24 = new ItemStack(LosthorizonModItems.ICE_CRYSTAL_IRON_RING.get()).copy();
				_setstack24.setCount(1);
				_menu.getSlots().get(3).set(_setstack24);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu26 ? _menu26.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.GOLD_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu28 ? _menu28.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.MYTHRIL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu30 ? _menu30.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu32 ? _menu32.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack37 = new ItemStack(LosthorizonModItems.MYTHRIL_GOLD_RING.get()).copy();
				_setstack37.setCount(1);
				_menu.getSlots().get(3).set(_setstack37);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu39 ? _menu39.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.IRON_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu41 ? _menu41.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.MYTHRIL.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu43 ? _menu43.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu45 ? _menu45.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack50 = new ItemStack(LosthorizonModItems.MYTHRIL_IRON_RING.get()).copy();
				_setstack50.setCount(1);
				_menu.getSlots().get(3).set(_setstack50);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu52 ? _menu52.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.GOLD_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu54 ? _menu54.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.ONYX.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu56 ? _menu56.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu58 ? _menu58.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack63 = new ItemStack(LosthorizonModItems.ONYX_GOLD_RING.get()).copy();
				_setstack63.setCount(1);
				_menu.getSlots().get(3).set(_setstack63);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu65 ? _menu65.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.IRON_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu67 ? _menu67.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.ONYX.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu69 ? _menu69.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu71 ? _menu71.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack76 = new ItemStack(LosthorizonModItems.ONYX_IRON_RING.get()).copy();
				_setstack76.setCount(1);
				_menu.getSlots().get(3).set(_setstack76);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu78 ? _menu78.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.GOLD_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu80 ? _menu80.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu82 ? _menu82.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu84 ? _menu84.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack89 = new ItemStack(LosthorizonModItems.EMERALD_GOLD_RING.get()).copy();
				_setstack89.setCount(1);
				_menu.getSlots().get(3).set(_setstack89);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu91 ? _menu91.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.IRON_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu93 ? _menu93.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == Items.EMERALD
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu95 ? _menu95.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu97 ? _menu97.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack102 = new ItemStack(LosthorizonModItems.EMERALD_IRON_RING.get()).copy();
				_setstack102.setCount(1);
				_menu.getSlots().get(3).set(_setstack102);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu104 ? _menu104.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.GOLD_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu106 ? _menu106.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.STARRY_JADE.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu108 ? _menu108.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu110 ? _menu110.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack115 = new ItemStack(LosthorizonModItems.STARRY_JADE_GOLD_RING.get()).copy();
				_setstack115.setCount(1);
				_menu.getSlots().get(3).set(_setstack115);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
		if ((entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu117 ? _menu117.getSlots().get(0).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.IRON_RING.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu119 ? _menu119.getSlots().get(1).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.STARRY_JADE.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu121 ? _menu121.getSlots().get(2).getItem() : ItemStack.EMPTY).getItem() == LosthorizonModItems.HEART_LINK.get()
				&& (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu123 ? _menu123.getSlots().get(3).getItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem()) {
			if (entity instanceof Player _player && _player.containerMenu instanceof LosthorizonModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).remove(1);
				_menu.getSlots().get(1).remove(1);
				ItemStack _setstack128 = new ItemStack(LosthorizonModItems.STARRY_JADE_IRON_RING.get()).copy();
				_setstack128.setCount(1);
				_menu.getSlots().get(3).set(_setstack128);
				_player.containerMenu.broadcastChanges();
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("losthorizon:ring_infuser")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
		}
	}
}