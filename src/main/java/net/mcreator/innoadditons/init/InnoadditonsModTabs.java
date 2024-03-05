
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.innoadditons.InnoadditonsMod;

public class InnoadditonsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InnoadditonsMod.MODID);
	public static final RegistryObject<CreativeModeTab> INNO_ADDITONS = REGISTRY.register("inno_additons",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.innoadditons.inno_additons")).icon(() -> new ItemStack(InnoadditonsModItems.NETHER_DUST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InnoadditonsModItems.NETHER_DUST.get());
				tabData.accept(InnoadditonsModItems.LIQUID_NETHER_DUST_BUCKET.get());
				tabData.accept(InnoadditonsModBlocks.LITHIUM_ORE.get().asItem());
				tabData.accept(InnoadditonsModItems.LITHIUM.get());
			})

					.build());
}
