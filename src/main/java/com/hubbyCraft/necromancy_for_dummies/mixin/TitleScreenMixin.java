package com.hubbyCraft.necromancy_for_dummies.mixin;

import com.hubbyCraft.necromancy_for_dummies.NecromancyForDummies;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void necromancy_for_dummies$onInit(CallbackInfo ci) {
		NecromancyForDummies.INSTANCE.getLOGGER().info("This line is printed by a Necromancy For DUmmies mixin!");
	}
}
