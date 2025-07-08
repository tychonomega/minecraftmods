package net.mcreator.lucassmod.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SaphireblockBlock extends Block {
	public SaphireblockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}