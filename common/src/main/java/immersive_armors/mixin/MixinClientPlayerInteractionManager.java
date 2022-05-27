package immersive_armors.mixin;

import net.minecraft.client.network.ClientPlayerInteractionManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPlayerInteractionManager.class)
public class MixinClientPlayerInteractionManager {
    @Inject(method = "getReachDistance()F", at = @At("HEAD"), cancellable = true)
    public void injectGetReachDistance(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(100.0f);
    }
}
