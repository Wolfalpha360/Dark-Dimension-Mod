package dark.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class AcidMobplayerCollidesBlockProcedure extends DarkModElements.ModElement {
	public AcidMobplayerCollidesBlockProcedure(DarkModElements instance) {
		super(instance, 83);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AcidMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 1, (int) 15, (false), (false)));
	}
}
