package net.mcreator.lucassmod.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class UraniumblockBlock extends Block {
	public UraniumblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(2.5f, 10f).lightLevel(s -> 15));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}