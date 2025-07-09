package net.mcreator.lucassmod.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.lucassmod.init.LucassModModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements LucassModModBiomes.LucassModModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> lucass_mod_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.lucass_mod_dimensionTypeReference != null) {
			retval = LucassModModBiomes.adaptSurfaceRule(retval, this.lucass_mod_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setlucass_modDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.lucass_mod_dimensionTypeReference = dimensionType;
	}
}