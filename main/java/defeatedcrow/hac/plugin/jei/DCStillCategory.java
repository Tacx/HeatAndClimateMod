package defeatedcrow.hac.plugin.jei;

import java.util.List;

import com.google.common.collect.Lists;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.core.ClimateCore;
import defeatedcrow.hac.core.fluid.FluidDic;
import defeatedcrow.hac.core.fluid.FluidDictionaryDC;
import defeatedcrow.hac.core.plugin.jei.ingredients.ClimateTypes;
import defeatedcrow.hac.core.plugin.jei.ingredients.HeatTierRenderer;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class DCStillCategory implements IRecipeCategory {

	private final IDrawableStatic background;

	public DCStillCategory(IGuiHelper guiHelper) {
		ResourceLocation location = new ResourceLocation("dcs_climate", "textures/gui/still_gui.png");
		background = guiHelper.createDrawable(location, 8, 12, 160, 68);
	}

	@Override
	public String getUid() {
		return "dcs_climate.still";
	}

	@Override
	public String getTitle() {
		return I18n.format(getUid());
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public void drawExtras(Minecraft mc) {}

	@Override
	public IDrawable getIcon() {
		return null;
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, IRecipeWrapper recipeWrapper, IIngredients ingredients) {
		if (!(recipeWrapper instanceof DCStillWrapper))
			return;
		DCStillWrapper wrapper = ((DCStillWrapper) recipeWrapper);
		// wrapper.getIngredients(ingredients);

		List<List<ItemStack>> inputs = wrapper.getRecipeInputs();
		List<ItemStack> outputs = wrapper.getOutputs();
		List<FluidStack> inF = wrapper.getFluidInputs();
		List<FluidStack> outF = wrapper.getFluidOutputs();

		if (!inputs.isEmpty()) {
			for (int i = 0; i < 2; i++) {
				if (i < inputs.size()) {
					recipeLayout.getItemStacks().init(i, true, 48, 5 + i * 18);
					if (inputs.get(i) instanceof List) {
						recipeLayout.getItemStacks().set(i, inputs.get(i));
					}
				}
			}
		}

		recipeLayout.getItemStacks().init(3, false, 92, 23);
		recipeLayout.getItemStacks().set(3, outputs.get(0));

		if (!inF.isEmpty() && inF.get(0) != null) {
			FluidStack f1 = inF.get(0);
			recipeLayout.getFluidStacks().init(0, false, 30, 8, 12, 50, 5000, false, null);
			FluidDic dic = FluidDictionaryDC.getDic(f1);
			if (dic != null && !dic.fluids.isEmpty()) {
				List<FluidStack> ret = Lists.newArrayList();
				for (Fluid f : dic.fluids) {
					ret.add(new FluidStack(f, f1.amount));
				}
				recipeLayout.getFluidStacks().set(0, ret);
			} else {
				recipeLayout.getFluidStacks().set(0, f1);
			}

		}
		if (!outF.isEmpty() && outF.get(0) != null) {
			FluidStack f2 = outF.get(0);
			recipeLayout.getFluidStacks().init(1, false, 117, 8, 12, 50, 5000, false, null);
			recipeLayout.getFluidStacks().set(1, f2);
		}

		List<DCHeatTier> temps = wrapper.getTemps();
		int i = 0;
		for (DCHeatTier temp : temps) {
			recipeLayout.getIngredientsGroup(ClimateTypes.TEMP)
					.init(i, true, new HeatTierRenderer(), 65 + i * 16, 45, 16, 16, 0, 0);
			recipeLayout.getIngredientsGroup(ClimateTypes.TEMP).set(i, temp);
			i++;
		}
	}

	@Override
	public String getModName() {
		return ClimateCore.MOD_NAME;
	}

}
