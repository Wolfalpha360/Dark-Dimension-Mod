package dark.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class QuicksandEntityCollidesInTheBlockProcedure extends DarkModElements.ModElement {
	public QuicksandEntityCollidesInTheBlockProcedure(DarkModElements instance) {
		super(instance, 88);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure QuicksandEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.DROWN, (float) 1);
	}
}
