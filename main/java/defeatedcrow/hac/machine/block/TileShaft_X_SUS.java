package defeatedcrow.hac.machine.block;

public class TileShaft_X_SUS extends TileShaft_X {

	// tier
	@Override
	public float maxTorque() {
		return 512.0F;
	}

	@Override
	public float getGearTier() {
		return 64.0F;
	}
}
