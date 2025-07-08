/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lucassmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.lucassmod.block.SaphireblockBlock;
import net.mcreator.lucassmod.block.SaphireBlock;
import net.mcreator.lucassmod.LucassModMod;

import java.util.function.Function;

public class LucassModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(LucassModMod.MODID);
	public static final DeferredBlock<Block> SAPHIRE = register("saphire", SaphireBlock::new);
	public static final DeferredBlock<Block> SAPHIREBLOCK = register("saphireblock", SaphireblockBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}