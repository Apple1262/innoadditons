
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.innochilzz.innoadditons.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.innochilzz.innoadditons.network.UtilityMenuMessage;
import net.innochilzz.innoadditons.InnoadditonsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class InnoadditonsModKeyMappings {
	public static final KeyMapping UTILITY_MENU_KEY = new KeyMapping("key.innoadditons.utility_menu_key", GLFW.GLFW_KEY_F4, "key.categories.innoadditons") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				InnoadditonsMod.PACKET_HANDLER.sendToServer(new UtilityMenuMessage(0, 0));
				UtilityMenuMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(UTILITY_MENU_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				UTILITY_MENU_KEY.consumeClick();
			}
		}
	}
}
