package com.github.voxelfriend.engineeredgolems.core;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.NBTTagByte;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.Constants.NBT;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thaumcraft.api.*;
import thaumcraft.api.research.*;
import thaumcraft.api.aspects.*;
import thaumcraft.api.capabilities.ThaumcraftCapabilities;
import thaumcraft.api.golems.*;
import thaumcraft.api.golems.parts.*;
import thaumcraft.api.items.*;

import java.util.UUID;

import javax.swing.text.html.parser.Entity;

import com.github.voxelfriend.engineeredgolems.common.items.ModItems;

import blusunrize.immersiveengineering.common.IEContent;

public class CommonProxy {
	
	static ResourceLocation defaultGroup = new ResourceLocation("");
	
	public void preInit(FMLPreInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        ModItems.init();
    }

	public void init(FMLInitializationEvent event) {
		ResearchCategories.registerCategory("ENGINEERED_GOLEMS", "UNLOCKAUROMANCY",
				new AspectList(),
				new ResourceLocation("engineeredgolems", "textures/research/steel_golem.png"),
				new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_2.jpg"),
                new ResourceLocation("thaumcraft", "textures/gui/gui_research_back_over.png"));
		
		ThaumcraftApi.registerResearchLocation(new ResourceLocation(EngineeredGolems.MODID, "research/engineeredgolems"));
		initGolems();
	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
    }
	
	protected void initGolems() {    	
    	ResearchCategory engineeredgolems = ResearchCategories.getResearchCategory("ENGINEERED_GOLEMS"); {
    	
        }
    	
    	GolemMaterial.register(
                new GolemMaterial(
                        "TREATEDWOOD",
                        new String[]{"EG_MATSTUDTREATEDWOOD"},
                        new ResourceLocation(
                                "engineeredgolems",
                                "textures/entity/mat_treated_wood.png"
                        ),
                        6566425,
                        6,
                        2,
                        1,
                        new ItemStack(
                        		IEContent.itemMaterial,
                                3,
                                0
                        ),
                        new ItemStack(
                                ItemsTC.mechanismSimple
                        ),
                        new EnumGolemTrait[]{EnumGolemTrait.DEFT}
                        )
        );
    	
    	GolemMaterial.register(
                new GolemMaterial(
                        "STEEL",
                        new String[]{"EG_MATSTUDSTEEL"},
                        new ResourceLocation(
                                "engineeredgolems",
                                "textures/entity/mat_steel.png"
                        ),
                        4934475,
                        16,
                        12,
                        6,
                        new ItemStack(
                        		IEContent.itemMetal,
                                1,
                                38
                        ),
                        new ItemStack(
                                ItemsTC.mechanismSimple
                        ),
                        new EnumGolemTrait[]{EnumGolemTrait.HEAVY, EnumGolemTrait.CLUMSY, EnumGolemTrait.BLASTPROOF, EnumGolemTrait.FIREPROOF}
                        )
        );
    	
    	GolemMaterial.register(
                new GolemMaterial(
                        "DAPPER",
                        new String[]{"EG_DAPPER"},
                        new ResourceLocation(
                                "engineeredgolems",
                                "textures/entity/mat_dapper.png"
                        ),
                        4934475,
                        16,
                        12,
                        6,
                        new ItemStack(
                        		ModItems.DAPPER,
                                1
                        ),
                        new ItemStack(
                                ItemsTC.mechanismSimple
                        ),
                        new EnumGolemTrait[]{EnumGolemTrait.HEAVY, EnumGolemTrait.CLUMSY, EnumGolemTrait.BLASTPROOF, EnumGolemTrait.FIREPROOF}
                        )
        );
    	
        ScanningManager.addScannableThing(
                new ScanItem(
                        "f_EG_TREATEDWOOD",
                        new ItemStack(
                        		IEContent.blockTreatedWood,
                                1,
                                0
                        )
                )
        );
        ScanningManager.addScannableThing(
                new ScanItem(
                        "f_EG_DAPPER",
                        new ItemStack(
                        		ModItems.DAPPER,
                                1
                        )
                )
        );

        ScanningManager.addScannableThing(
                new ScanBlockState(
                        "f_EG_TREATED_WOOD",
                        IEContent.blockTreatedWood.getStateFromMeta(0),
                        false
                )
        );
        
        ScanningManager.addScannableThing(
                new ScanItem(
                        "f_EG_STEEL",
                        new ItemStack(
                        		IEContent.blockStorage,
                                1,
                                8
                        )
                )
        );

        ScanningManager.addScannableThing(
                new ScanBlockState(
                        "f_EG_STEEL",
                        IEContent.blockStorage.getStateFromMeta(8),
                        false
                )
        );
        
        
    }
}
