/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.losthorizon.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.Minecraft;

import net.mcreator.losthorizon.world.inventory.RingInfuserGUIMenu;
import net.mcreator.losthorizon.world.inventory.BackPackGuiMenu;
import net.mcreator.losthorizon.world.inventory.BackPackExtendedGuiMenu;
import net.mcreator.losthorizon.network.MenuStateUpdateMessage;
import net.mcreator.losthorizon.LosthorizonMod;

import java.util.Map;

public class LosthorizonModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, LosthorizonMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<BackPackGuiMenu>> BACK_PACK_GUI = REGISTRY.register("back_pack_gui", () -> IMenuTypeExtension.create(BackPackGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BackPackExtendedGuiMenu>> BACK_PACK_EXTENDED_GUI = REGISTRY.register("back_pack_extended_gui", () -> IMenuTypeExtension.create(BackPackExtendedGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<RingInfuserGUIMenu>> RING_INFUSER_GUI = REGISTRY.register("ring_infuser_gui", () -> IMenuTypeExtension.create(RingInfuserGUIMenu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(Player player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayer serverPlayer) {
				PacketDistributor.sendToPlayer(serverPlayer, new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.level().isClientSide) {
				if (Minecraft.getInstance().screen instanceof LosthorizonModScreens.ScreenAccessor accessor && needClientUpdate)
					accessor.updateMenuState(elementType, name, elementState);
				ClientPacketDistributor.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}