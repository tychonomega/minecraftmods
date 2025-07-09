package net.mcreator.lucassmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class UraniumItem extends Item {
	public UraniumItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(-20).saturationModifier(-1f).alwaysEdible().build()));
	}
}