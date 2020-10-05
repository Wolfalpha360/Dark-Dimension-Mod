package dark.procedures;

import net.minecraft.item.ItemStack;

import java.util.Random;
import java.util.Map;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class DarkDiminsionPortalTriggerUsedProcedure extends DarkModElements.ModElement {
	public DarkDiminsionPortalTriggerUsedProcedure(DarkModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure DarkDiminsionPortalTriggerUsed!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 32, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
	}
}
