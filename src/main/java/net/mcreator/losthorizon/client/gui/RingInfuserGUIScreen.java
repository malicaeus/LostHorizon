package net.mcreator.losthorizon.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.losthorizon.world.inventory.RingInfuserGUIMenu;
import net.mcreator.losthorizon.network.RingInfuserGUIButtonMessage;
import net.mcreator.losthorizon.init.LosthorizonModScreens;

public class RingInfuserGUIScreen extends AbstractContainerScreen<RingInfuserGUIMenu> implements LosthorizonModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_infuse;

	public RingInfuserGUIScreen(RingInfuserGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("losthorizon:textures/screens/ring_infuser_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.losthorizon.ring_infuser_gui.label_ring_infuser"), 6, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_infuse = Button.builder(Component.translatable("gui.losthorizon.ring_infuser_gui.button_infuse"), e -> {
			int x = RingInfuserGUIScreen.this.x;
			int y = RingInfuserGUIScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new RingInfuserGUIButtonMessage(0, x, y, z));
				RingInfuserGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 70, this.topPos + 38, 56, 20).build();
		this.addRenderableWidget(button_infuse);
	}
}