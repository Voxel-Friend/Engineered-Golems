
//Hello World

package com.github.voxelfriend.engineeredgolems.core;

import com.github.voxelfriend.engineeredgolems.common.items.ModItems;

import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
    }

    @SubscribeEvent
    public void onModelRegistry(ModelRegistryEvent event) {
    	ModItems.initModels();

    }
}