
package net.mcreator.innoadditons.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.innoadditons.init.InnoadditonsModItems;
import net.mcreator.innoadditons.init.InnoadditonsModFluids;
import net.mcreator.innoadditons.init.InnoadditonsModFluidTypes;
import net.mcreator.innoadditons.init.InnoadditonsModBlocks;

public abstract class LiquidNetherDustFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> InnoadditonsModFluidTypes.LIQUID_NETHER_DUST_TYPE.get(), () -> InnoadditonsModFluids.LIQUID_NETHER_DUST.get(),
			() -> InnoadditonsModFluids.FLOWING_LIQUID_NETHER_DUST.get()).explosionResistance(100f).levelDecreasePerBlock(4).bucket(() -> InnoadditonsModItems.LIQUID_NETHER_DUST_BUCKET.get())
			.block(() -> (LiquidBlock) InnoadditonsModBlocks.LIQUID_NETHER_DUST.get());

	private LiquidNetherDustFluid() {
		super(PROPERTIES);
	}

	public static class Source extends LiquidNetherDustFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidNetherDustFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
