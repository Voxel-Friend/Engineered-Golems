package com.github.voxelfriend.engineeredgolems.common.items;

import net.minecraft.block.Block;

public class ModItems {
	public static ItemBase DAPPER;
	
	public static void init() {
		DAPPER = new ItemBase("dapper");
	}
	
	public static void initModels() {
		DAPPER.initModel();
	}

}
