
package dark.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class DarkHoeItem extends DarkModElements.ModElement {
	@ObjectHolder("dark:dark_hoe")
	public static final Item block = null;
	public DarkHoeItem(DarkModElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("dark_hoe"));
	}
}
