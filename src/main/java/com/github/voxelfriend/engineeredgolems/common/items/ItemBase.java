package com.github.voxelfriend.engineeredgolems.common.items;

import com.github.voxelfriend.engineeredgolems.core.EngineeredGolems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item {
	
	public ItemBase(String name){
		super();
		setRegistryName(name);
		setUnlocalizedName(EngineeredGolems.MODID + "." + name);
		setCreativeTab(EngineeredGolems.mainTab);
		GameRegistry.findRegistry(Item.class).register(this);
	}
	
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName().toString()));
	}

}