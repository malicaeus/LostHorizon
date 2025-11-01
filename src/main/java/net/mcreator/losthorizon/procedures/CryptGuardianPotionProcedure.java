package net.mcreator.losthorizon.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.alchemy.PotionContents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ThrownSplashPotion;
import net.minecraft.world.entity.projectile.ThrownLingeringPotion;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractThrownPotion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

public class CryptGuardianPotionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double Chain = 0;
		double ChainWait = 0;
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 20) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = createPotionProjectile(projectileLevel, PotionContents.createItemStack(Items.SPLASH_POTION, Potions.SLOWNESS), null, new Vec3(0, 0, 0));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
		if (entity.getPersistentData().getDoubleOr("IA", 0) == 60) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = createPotionProjectile(projectileLevel, PotionContents.createItemStack(Items.SPLASH_POTION, Potions.HARMING), null, new Vec3(0, 0, 0));
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 5);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
		}
	}

	private static Projectile createPotionProjectile(Level level, ItemStack contents, Entity shooter, Vec3 acceleration) {
		AbstractThrownPotion entityToSpawn = contents.getItem() == Items.LINGERING_POTION ? new ThrownLingeringPotion(EntityType.LINGERING_POTION, level) : new ThrownSplashPotion(EntityType.SPLASH_POTION, level);
		entityToSpawn.setItem(contents);
		return initProjectileProperties(entityToSpawn, shooter, acceleration);
	}

	private static Projectile initProjectileProperties(Projectile entityToSpawn, Entity shooter, Vec3 acceleration) {
		entityToSpawn.setOwner(shooter);
		if (!Vec3.ZERO.equals(acceleration)) {
			entityToSpawn.setDeltaMovement(acceleration);
			entityToSpawn.hasImpulse = true;
		}
		return entityToSpawn;
	}
}