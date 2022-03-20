package mod.linguardium.swearitsnotcheating.mixin;

import net.minecraft.server.network.ServerPlayNetworkHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerPlayNetworkHandler.class)
public class ServerPlayNetworkHandlerMixin {
    @Redirect(at=@At(value="INVOKE",target="Ljava/lang/Math;abs(D)D",ordinal=0),method="onPlayerInteractBlock")
    private double anyDistanceBlockInteract(double d) {
        return 0;
    }
}
