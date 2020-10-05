
package dark.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import dark.item.DarkberrryItem;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class DarkberrryblockBlock extends DarkModElements.ModElement {
	@ObjectHolder("dark:darkberrryblock")
	public static final Block block = null;
	public DarkberrryblockBlock(DarkModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.LEAVES).sound(SoundType.NETHER_WART).hardnessAndResistance(0.3f, 3f).lightValue(0));
			setRegistryName("darkberrryblock");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(DarkberrryItem.block, (int) (1)));
		}
	}
}
