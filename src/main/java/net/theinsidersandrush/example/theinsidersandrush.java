package net.theinsidersandrush.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class theinsidersandrush implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("theinsidersandrush");
 		
	// an instance of our new item
		public static final Block UNKNOWN = new Block(FabricBlockSettings.of(Material.SOIL).strength(4.0f).sounds(BlockSoundGroup.SAND));
		@Override
		public void onInitialize() {
			Registry.register(Registry.BLOCK, new Identifier("theinsidersandrush", "unknown"), UNKNOWN);
			Registry.register(Registry.ITEM, new Identifier("theinsidersandrush", "unknown"), new BlockItem(UNKNOWN, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));

		}
	}