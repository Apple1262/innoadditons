
package net.mcreator.innoadditons.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.innoadditons.init.InnoadditonsModFluids;

public class LiquidNetherDustBlock extends LiquidBlock {
	public LiquidNetherDustBlock() {
		super(() -> InnoadditonsModFluids.LIQUID_NETHER_DUST.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
