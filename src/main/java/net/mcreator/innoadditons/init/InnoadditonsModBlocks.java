
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.innoadditons.block.LithiumOreBlock;
import net.mcreator.innoadditons.block.LiquidNetherDustBlock;
import net.mcreator.innoadditons.InnoadditonsMod;

public class InnoadditonsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, InnoadditonsMod.MODID);
	public static final RegistryObject<Block> LIQUID_NETHER_DUST = REGISTRY.register("liquid_nether_dust", () -> new LiquidNetherDustBlock());
	public static final RegistryObject<Block> LITHIUM_ORE = REGISTRY.register("lithium_ore", () -> new LithiumOreBlock());
}
