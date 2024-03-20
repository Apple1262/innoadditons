
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.innochilzz.innoadditons.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.innochilzz.innoadditons.client.gui.UtilityMenuGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InnoadditonsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(InnoadditonsModMenus.UTILITY_MENU_GUI.get(), UtilityMenuGuiScreen::new);
		});
	}
}
