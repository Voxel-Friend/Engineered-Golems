package com.github.voxelfriend.engineeredgolems.core;

import org.apache.logging.log4j.Logger;


import com.github.voxelfriend.engineeredgolems.core.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = EngineeredGolems.MODID, name = EngineeredGolems.NAME, version = EngineeredGolems.VERSION, dependencies = "required-after:immersiveengineering;required-after:thaumcraft")
public class EngineeredGolems {
	public static final String MODID = "engineeredgolems";
	public static final String NAME = "Engineered Golems";
    public static final String VERSION = "1.0";
    
    @SidedProxy(clientSide = "com.github.voxelfriend.engineeredgolems.core.ClientProxy", serverSide = "com.github.voxelfriend.engineeredgolems.core.CommonProxy")
    public static CommonProxy proxy;
    
    public static CreativeTabs mainTab = new CreativeTabs("engineeredgolems.main") {
		@Override
		public String getTabLabel() {
			return "engineeredgolems.main";
		}

		@Override
		@SideOnly(Side.CLIENT)
		public ItemStack getTabIconItem() {
			return new ItemStack(thaumcraft.api.items.ItemsTC.golemBell);
		}
    };
    
    @EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
}
}
