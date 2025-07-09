package net.mcreator.lucassmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class UraniumoreBlock extends Block {
	public UraniumoreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE).strength(2f, 10f).lightLevel(s -> 10));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}