package defeatedcrow.hac.main.recipes;

import java.util.ArrayList;
import java.util.List;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.climate.IClimate;
import defeatedcrow.hac.core.util.DCUtil;
import defeatedcrow.hac.main.api.MainAPIManager;
import defeatedcrow.hac.main.api.brewing.IAgingRecipeDC;
import defeatedcrow.hac.main.api.brewing.IBrewingRecipeDC;
import defeatedcrow.hac.main.api.brewing.IBrewingRecipeRegister;
import defeatedcrow.hac.main.api.brewing.IStillRecipeDC;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.OreDictionary;

public class FoodBrewingRecipeRegister implements IBrewingRecipeRegister {

	public IBrewingRecipeRegister instance() {
		return MainAPIManager.brewingRegister;
	}

	private static List<IBrewingRecipeDC> brewing;
	private static List<IStillRecipeDC> still;
	private static List<IAgingRecipeDC> aging;

	public FoodBrewingRecipeRegister() {
		brewing = new ArrayList<IBrewingRecipeDC>();
		still = new ArrayList<IStillRecipeDC>();
		aging = new ArrayList<IAgingRecipeDC>();
	}

	@Override
	public List<IBrewingRecipeDC> getBrewingList() {
		return brewing;
	}

	@Override
	public List<IStillRecipeDC> getStillList() {
		return still;
	}

	@Override
	public List<IAgingRecipeDC> getAgingList() {
		return aging;
	}

	@Override
	public void addBrewingRecipe(IBrewingRecipeDC recipe) {
		if (recipe != null) {
			boolean b1 = recipe.getInput() == null && recipe.getInputFluid() == null;
			boolean b2 = DCUtil.isEmpty(recipe.getOutput()) && recipe.getOutputFluid() == null;
			boolean b3 = hasEmptyInput(recipe.getInput());
			if (!b1 && !b2 && !b3) {
				brewing.add(recipe);
			}
		}
	}

	@Override
	public void addStillRecipe(IStillRecipeDC recipe) {

	}

	@Override
	public void addAgingRecipe(IAgingRecipeDC recipe) {

	}

	@Override
	public IBrewingRecipeDC getBrewingRecipe(IClimate clm, List<ItemStack> inputs, FluidStack inFluid) {
		for (IBrewingRecipeDC recipe : brewing) {
			if (recipe.matches(inputs, inFluid) && recipe.matchClimate(clm)) {
				return recipe;
			}
		}
		return null;
	}

	@Override
	public IStillRecipeDC getStillRecipe(DCHeatTier hot, DCHeatTier cold, List<ItemStack> inputs, FluidStack inFluid) {
		return null;
	}

	@Override
	public IAgingRecipeDC getAgingRecipe(IClimate clm, List<ItemStack> inputs, FluidStack inFluid) {
		return null;
	}

	@Override
	public boolean removeBrewingRecipe(IClimate clm, List<ItemStack> inputs, FluidStack inFluid) {
		IBrewingRecipeDC recipe = getBrewingRecipe(clm, inputs, inFluid);
		if (recipe != null && brewing.remove(recipe)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeStillRecipe(DCHeatTier hot, DCHeatTier cold, List<ItemStack> inputs, FluidStack inFluid) {
		return false;
	}

	@Override
	public boolean removeAgingRecipe(IClimate clm, List<ItemStack> inputs, FluidStack inFluid) {
		return false;
	}

	private boolean hasEmptyInput(Object[] inputs) {
		if (inputs != null && inputs.length > 0) {
			for (Object in : inputs) {
				if (in instanceof String) {
					boolean ret = true;
					if (OreDictionary.doesOreNameExist((String) in)) {
						List l = OreDictionary.getOres((String) in);
						if (!l.isEmpty() && l.size() > 0) {
							ret = false;
						}
					}

					if (ret) {
						return true;
					}
				} else if (in == null) {
					return true;
				}
			}

			return false;
		} else {
			return false;
		}
	}

}
