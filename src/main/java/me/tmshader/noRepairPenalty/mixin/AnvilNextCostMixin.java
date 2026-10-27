package me.tmshader.norepairpenalty.mixin;

import net.minecraft.world.inventory.AnvilMenu;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Forces prior-work penalty growth to 0 so repair/combine cost does not
 * escalate with each anvil use.
 *
 * Mojang 26.x: AnvilMenu.calculateIncreasedRepairCost(I)I
 */
@Mixin(AnvilMenu.class)
public class AnvilNextCostMixin {

    @Inject(method = "calculateIncreasedRepairCost", at = @At("RETURN"), cancellable = true)
    private static void noRepairPenalty$zeroNextCost(int cost, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
