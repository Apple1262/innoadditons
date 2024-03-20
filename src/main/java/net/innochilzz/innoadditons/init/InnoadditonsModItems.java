
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.innochilzz.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.innochilzz.innoadditons.item.NetherDustItem;
import net.innochilzz.innoadditons.InnoadditonsMod;

public class InnoadditonsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InnoadditonsMod.MODID);
	public static final RegistryObject<Item> NETHER_DUST = REGISTRY.register("nether_dust", () -> new NetherDustItem());
}
