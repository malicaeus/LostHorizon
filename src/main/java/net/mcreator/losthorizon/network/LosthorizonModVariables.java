package net.mcreator.losthorizon.network;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.neoforge.network.PacketDistributor;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.common.util.ValueIOSerializable;
import net.neoforged.neoforge.attachment.AttachmentType;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.storage.ValueOutput;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.TagValueOutput;
import net.minecraft.world.level.storage.TagValueInput;
import net.minecraft.util.ProblemReporter;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;

import net.mcreator.losthorizon.LosthorizonMod;

import java.util.function.Supplier;

@EventBusSubscriber
public class LosthorizonModVariables {
	public static final DeferredRegister<AttachmentType<?>> ATTACHMENT_TYPES = DeferredRegister.create(NeoForgeRegistries.Keys.ATTACHMENT_TYPES, LosthorizonMod.MODID);
	public static final Supplier<AttachmentType<PlayerVariables>> PLAYER_VARIABLES = ATTACHMENT_TYPES.register("player_variables", () -> AttachmentType.serializable(() -> new PlayerVariables()).build());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		LosthorizonMod.addNetworkMessage(PlayerVariablesSyncMessage.TYPE, PlayerVariablesSyncMessage.STREAM_CODEC, PlayerVariablesSyncMessage::handleData);
	}

	@SubscribeEvent
	public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (event.getEntity() instanceof ServerPlayer player)
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
	}

	@SubscribeEvent
	public static void onPlayerTickUpdateSyncPlayerVariables(PlayerTickEvent.Post event) {
		if (event.getEntity() instanceof ServerPlayer player && player.getData(PLAYER_VARIABLES)._syncDirty) {
			PacketDistributor.sendToPlayer(player, new PlayerVariablesSyncMessage(player.getData(PLAYER_VARIABLES)));
			player.getData(PLAYER_VARIABLES)._syncDirty = false;
		}
	}

	@SubscribeEvent
	public static void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = event.getOriginal().getData(PLAYER_VARIABLES);
		PlayerVariables clone = new PlayerVariables();
		clone.homeX = original.homeX;
		clone.homeZ = original.homeZ;
		clone.homeY = original.homeY;
		if (!event.isWasDeath()) {
			clone.PreventClimbingFallDamage = original.PreventClimbingFallDamage;
			clone.nbrjump = original.nbrjump;
			clone.necromancer_grimoire = original.necromancer_grimoire;
			clone.ice_crystal_silver_ring_cooldown = original.ice_crystal_silver_ring_cooldown;
			clone.ice_crystal_gold_ring_cooldown = original.ice_crystal_gold_ring_cooldown;
			clone.onyx_gold_ring_cooldown = original.onyx_gold_ring_cooldown;
			clone.emerald_gold_ring_cooldown = original.emerald_gold_ring_cooldown;
			clone.starry_jade_iron_rinh_cooldown = original.starry_jade_iron_rinh_cooldown;
			clone.dice_cooldown = original.dice_cooldown;
			clone.linked_soul = original.linked_soul;
		}
		event.getEntity().setData(PLAYER_VARIABLES, clone);
	}

	public static class PlayerVariables implements ValueIOSerializable {
		boolean _syncDirty = false;
		public boolean PreventClimbingFallDamage = false;
		public double homeX = 0;
		public double homeZ = 0;
		public double homeY = 0;
		public double nbrjump = 0;
		public boolean necromancer_grimoire = false;
		public boolean ice_crystal_silver_ring_cooldown = false;
		public boolean ice_crystal_gold_ring_cooldown = false;
		public boolean onyx_gold_ring_cooldown = false;
		public boolean emerald_gold_ring_cooldown = false;
		public boolean starry_jade_iron_rinh_cooldown = false;
		public boolean dice_cooldown = false;
		public double linked_soul = 0;

		@Override
		public void serialize(ValueOutput output) {
			output.putBoolean("PreventClimbingFallDamage", PreventClimbingFallDamage);
			output.putDouble("homeX", homeX);
			output.putDouble("homeZ", homeZ);
			output.putDouble("homeY", homeY);
			output.putDouble("nbrjump", nbrjump);
			output.putBoolean("necromancer_grimoire", necromancer_grimoire);
			output.putBoolean("ice_crystal_silver_ring_cooldown", ice_crystal_silver_ring_cooldown);
			output.putBoolean("ice_crystal_gold_ring_cooldown", ice_crystal_gold_ring_cooldown);
			output.putBoolean("onyx_gold_ring_cooldown", onyx_gold_ring_cooldown);
			output.putBoolean("emerald_gold_ring_cooldown", emerald_gold_ring_cooldown);
			output.putBoolean("starry_jade_iron_rinh_cooldown", starry_jade_iron_rinh_cooldown);
			output.putBoolean("dice_cooldown", dice_cooldown);
			output.putDouble("linked_soul", linked_soul);
		}

		@Override
		public void deserialize(ValueInput input) {
			PreventClimbingFallDamage = input.getBooleanOr("PreventClimbingFallDamage", false);
			homeX = input.getDoubleOr("homeX", 0);
			homeZ = input.getDoubleOr("homeZ", 0);
			homeY = input.getDoubleOr("homeY", 0);
			nbrjump = input.getDoubleOr("nbrjump", 0);
			necromancer_grimoire = input.getBooleanOr("necromancer_grimoire", false);
			ice_crystal_silver_ring_cooldown = input.getBooleanOr("ice_crystal_silver_ring_cooldown", false);
			ice_crystal_gold_ring_cooldown = input.getBooleanOr("ice_crystal_gold_ring_cooldown", false);
			onyx_gold_ring_cooldown = input.getBooleanOr("onyx_gold_ring_cooldown", false);
			emerald_gold_ring_cooldown = input.getBooleanOr("emerald_gold_ring_cooldown", false);
			starry_jade_iron_rinh_cooldown = input.getBooleanOr("starry_jade_iron_rinh_cooldown", false);
			dice_cooldown = input.getBooleanOr("dice_cooldown", false);
			linked_soul = input.getDoubleOr("linked_soul", 0);
		}

		public void markSyncDirty() {
			_syncDirty = true;
		}
	}

	public record PlayerVariablesSyncMessage(PlayerVariables data) implements CustomPacketPayload {
		public static final Type<PlayerVariablesSyncMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(LosthorizonMod.MODID, "player_variables_sync"));
		public static final StreamCodec<RegistryFriendlyByteBuf, PlayerVariablesSyncMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, PlayerVariablesSyncMessage message) -> {
			TagValueOutput output = TagValueOutput.createWithoutContext(ProblemReporter.DISCARDING);
			message.data.serialize(output);
			buffer.writeNbt(output.buildResult());
		}, (RegistryFriendlyByteBuf buffer) -> {
			PlayerVariablesSyncMessage message = new PlayerVariablesSyncMessage(new PlayerVariables());
			message.data.deserialize(TagValueInput.create(ProblemReporter.DISCARDING, buffer.registryAccess(), buffer.readNbt()));
			return message;
		});

		@Override
		public Type<PlayerVariablesSyncMessage> type() {
			return TYPE;
		}

		public static void handleData(final PlayerVariablesSyncMessage message, final IPayloadContext context) {
			if (context.flow() == PacketFlow.CLIENTBOUND && message.data != null) {
				context.enqueueWork(() -> {
					TagValueOutput output = TagValueOutput.createWithContext(ProblemReporter.DISCARDING, context.player().registryAccess());
					message.data.serialize(output);
					context.player().getData(PLAYER_VARIABLES).deserialize(TagValueInput.create(ProblemReporter.DISCARDING, context.player().registryAccess(), output.buildResult()));
				}).exceptionally(e -> {
					context.connection().disconnect(Component.literal(e.getMessage()));
					return null;
				});
			}
		}
	}
}