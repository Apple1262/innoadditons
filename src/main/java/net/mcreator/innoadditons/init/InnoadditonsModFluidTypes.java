
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.innoadditons.fluid.types.LiquidNetherDustFluidType;
import net.mcreator.innoadditons.InnoadditonsMod;

public class InnoadditonsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, InnoadditonsMod.MODID);
	public static final RegistryObject<FluidType> LIQUID_NETHER_DUST_TYPE = REGISTRY.register("liquid_nether_dust", () -> new LiquidNetherDustFluidType());
}
