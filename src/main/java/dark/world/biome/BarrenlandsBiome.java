
package dark.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;

import dark.block.DarkstoneBlock;
import dark.block.CrushedDarkstoneBlock;

import dark.DarkModElements;

@DarkModElements.ModElement.Tag
public class BarrenlandsBiome extends DarkModElements.ModElement {
	@ObjectHolder("dark:barrenlands")
	public static final CustomBiome biome = null;
	public BarrenlandsBiome(DarkModElements instance) {
		super(instance, 86);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0f).temperature(0.5f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NONE).waterColor(4159204).waterFogColor(329011)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(CrushedDarkstoneBlock.block.getDefaultState(),
							DarkstoneBlock.block.getDefaultState(), DarkstoneBlock.block.getDefaultState())));
			setRegistryName("barrenlands");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColor() {
			return -16777114;
		}
	}
}
