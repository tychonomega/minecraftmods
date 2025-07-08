/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucassmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.lucassmod.item.SaphiregemItem;
import net.mcreator.lucassmod.LucassModMod;

import java.util.function.Function;

public class LucassModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LucassModMod.MODID);
	public static final DeferredItem<Item> SAPHIRE = block(LucassModModBlocks.SAPHIRE, new Item.Properties().rarity(Rarity.RARE));
	public static final DeferredItem<Item> SAPHIREGEM = register("saphiregem", SaphiregemItem::new);
	public static final DeferredItem<Item> SAPHIREBLOCK = block(LucassModModBlocks.SAPHIREBLOCK, new Item.Properties().rarity(Rarity.EPIC));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}