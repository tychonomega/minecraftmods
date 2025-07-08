package net.mcreator.lucassmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SaphiregemItem extends Item {
	public SaphiregemItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE));
	}
}