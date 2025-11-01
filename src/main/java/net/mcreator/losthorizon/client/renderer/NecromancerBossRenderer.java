package net.mcreator.losthorizon.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.animation.KeyframeAnimation;

import net.mcreator.losthorizon.entity.NecromancerBossEntity;
import net.mcreator.losthorizon.client.model.animations.necromancerAnimation;
import net.mcreator.losthorizon.client.model.Modelnecromancer;

public class NecromancerBossRenderer extends MobRenderer<NecromancerBossEntity, LivingEntityRenderState, Modelnecromancer> {
	private NecromancerBossEntity entity = null;

	public NecromancerBossRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelnecromancer.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(NecromancerBossEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
		if (this.model instanceof AnimatedModel) {
			((AnimatedModel) this.model).setEntity(entity);
		}
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("losthorizon:textures/entities/necromancer.png");
	}

	private static final class AnimatedModel extends Modelnecromancer {
		private NecromancerBossEntity entity = null;
		private final KeyframeAnimation keyframeAnimation0;
		private final KeyframeAnimation keyframeAnimation1;
		private final KeyframeAnimation keyframeAnimation2;
		private final KeyframeAnimation keyframeAnimation3;

		public AnimatedModel(ModelPart root) {
			super(root);
			this.keyframeAnimation0 = necromancerAnimation.walk.bake(root);
			this.keyframeAnimation1 = necromancerAnimation.death.bake(root);
			this.keyframeAnimation2 = necromancerAnimation.idle.bake(root);
			this.keyframeAnimation3 = necromancerAnimation.attack.bake(root);
		}

		public void setEntity(NecromancerBossEntity entity) {
			this.entity = entity;
		}

		@Override
		public void setupAnim(LivingEntityRenderState state) {
			this.root().getAllParts().forEach(ModelPart::resetPose);
			this.keyframeAnimation0.applyWalk(state.walkAnimationPos, state.walkAnimationSpeed, 1f, 1f);
			this.keyframeAnimation1.apply(entity.animationState1, state.ageInTicks, 1f);
			this.keyframeAnimation2.apply(entity.animationState2, state.ageInTicks, 1f);
			this.keyframeAnimation3.apply(entity.animationState3, state.ageInTicks, 1f);
			super.setupAnim(state);
		}
	}
}