
package dark.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import dark.block.DarkrootplanksBlock;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class DarkplankfuelFuel extends DarkModElements.ModElement {
	public DarkplankfuelFuel(DarkModElements instance) {
		super(instance, 59);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(DarkrootplanksBlock.block, (int) (1)).getItem())
			event.setBurnTime(300);
	}
}
