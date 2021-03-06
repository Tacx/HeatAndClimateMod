package defeatedcrow.hac.magic.client;

import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class ProjCircleRenderer extends MagicCircleRenderer {

	private static final ResourceLocation TEX = new ResourceLocation("dcs_climate",
			"textures/entity/magic/circle_thunder.png");

	public ProjCircleRenderer(RenderManager renderManager) {
		super(renderManager);
	}

	@Override
	protected ResourceLocation getTexture() {
		return TEX;
	}

}
