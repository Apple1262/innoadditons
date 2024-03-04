
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.innoadditons.fluid.LiquidNetherDustFluid;
import net.mcreator.innoadditons.InnoadditonsMod;

public class InnoadditonsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, InnoadditonsMod.MODID);
	public static final RegistryObject<FlowingFluid> LIQUID_NETHER_DUST = REGISTRY.register("liquid_nether_dust", () -> new LiquidNetherDustFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_NETHER_DUST = REGISTRY.register("flowing_liquid_nether_dust", () -> new LiquidNetherDustFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_NETHER_DUST.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_NETHER_DUST.get(), RenderType.translucent());
		}
	}
}
