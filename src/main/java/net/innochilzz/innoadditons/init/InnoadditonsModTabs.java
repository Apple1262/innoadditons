
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.innochilzz.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.innochilzz.innoadditons.InnoadditonsMod;

public class InnoadditonsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InnoadditonsMod.MODID);
	public static final RegistryObject<CreativeModeTab> INNO_ADDITONS = REGISTRY.register("inno_additons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.innoadditons.inno_additons")).icon(() -> new ItemStack(InnoadditonsModItems.NETHER_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InnoadditonsModItems.NETHER_DUST.get());
			})

					.build());
}
