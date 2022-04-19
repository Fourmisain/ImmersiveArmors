package immersive_armors.client.render.entity.piece;

import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.LivingEntity;

public class MiddleBodyLayerPiece  extends LayerPiece {
    private static final BipedEntityModel<LivingEntity> model = new BipedEntityModel<>(0.5f);

    public MiddleBodyLayerPiece() {
        texture("layer_1_middle");
    }

    @Override
    protected BipedEntityModel<LivingEntity> getModel() {
        return model;
    }
}