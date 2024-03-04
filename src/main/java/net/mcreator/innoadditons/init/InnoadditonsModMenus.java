
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.innoadditons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.innoadditons.world.inventory.UtilityMenuGuiMenu;
import net.mcreator.innoadditons.InnoadditonsMod;

public class InnoadditonsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, InnoadditonsMod.MODID);
	public static final RegistryObject<MenuType<UtilityMenuGuiMenu>> UTILITY_MENU_GUI = REGISTRY.register("utility_menu_gui", () -> IForgeMenuType.create(UtilityMenuGuiMenu::new));
}
