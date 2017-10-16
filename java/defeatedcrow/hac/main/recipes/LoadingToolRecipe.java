package defeatedcrow.hac.main.recipes;

import defeatedcrow.hac.core.DCInit;
import defeatedcrow.hac.core.DCRecipe;
import defeatedcrow.hac.machine.MachineInit;
import defeatedcrow.hac.main.MainInit;
import defeatedcrow.hac.main.config.ModuleConfig;
import defeatedcrow.hac.main.util.RecipeResourcesMain;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class LoadingToolRecipe {

	public static void add(RecipeResourcesMain res) {
		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 0), new Object[] {
				"XXX", "XYX", "XXX", 'X', new ItemStack(Blocks.TALLGRASS, 1, 1), 'Y', "stickWood"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 0), new Object[] {
				"XXX", "XYX", "XXX", 'X', "blockTallGrass", 'Y', "stickWood"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 1), new Object[] {
				"XXX", "XYX", "XXX", 'X', new ItemStack(Items.STRING, 1, 0), 'Y', "stickWood"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 1), new Object[] {
				"XXX", "XYX", "XXX", 'X', "cropCotton", 'Y', "stickWood"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 2), new Object[] {
				" X ", "X X", " X ", 'X', new ItemStack(MainInit.materials, 1, 0)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 3), new Object[] {
				" X ", "X X", " X ", 'X', new ItemStack(MainInit.materials, 1, 1)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 4), new Object[] {
				" X ", "XYX", " X ", 'X', "plankWood", 'Y', new ItemStack(Items.STICK, 1, 0)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 5), new Object[] {
				" X ", "XYX", " X ", 'Y', "gearWood", 'X', "ingotBrass"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 6), new Object[] {
				" X ", "XYX", " X ", 'Y', "gearBrass", 'X', "ingotNickelsilver"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 7), new Object[] {
				" X ", "XYX", " X ", 'Y', "gearBrass", 'X', "ingotSteel"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 6), new Object[] {
				" X ", "XYX", " X ", 'Y', "gearIron", 'X', "ingotNickelsilver"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.materials, 1, 7), new Object[] {
				" X ", "XYX", " X ", 'Y', "gearIron", 'X', "ingotSteel"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.stoneYagen, 1, 0), new Object[] {
				" X ", "XYX", "XXX", 'X', new ItemStack(Blocks.COBBLESTONE, 1, 0), 'Y',
				new ItemStack(MainInit.materials, 1, 4)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.brassYagen, 1, 0), new Object[] {
				" X ", "XYX", "XXX", 'X', "ingotBrass", 'Y', new ItemStack(MainInit.materials, 1, 4)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(DCInit.climate_checker, 1, 0), new Object[] {
				" Z ", "XYX", " Z ", 'X', new ItemStack(Items.GOLD_INGOT, 1, 0), 'Y',
				new ItemStack(Items.REDSTONE, 1, 0), 'Z', "gemChalcedony"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.stevenson_screen, 1, 0), new Object[] {
				"XZX", "ZYZ", "XZX", 'X', "plankWood", 'Y', new ItemStack(DCInit.climate_checker), 'Z', "dyeWhite"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.thermometer, 1, 0), new Object[] {
				"X", "Y", "Z", 'X', "bucketWater", 'Y', new ItemStack(DCInit.climate_checker), 'Z',
				new ItemStack(Blocks.GLASS)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.windvane, 1, 0), new Object[] {
				" X ", "XYX", " X ", 'X', "ingotBrass", 'Y', new ItemStack(DCInit.climate_checker)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.chamber, 1, 0), new Object[] {
				"ZXZ", "XYX", "ZXZ", 'Y', new ItemStack(Blocks.FURNACE, 1, 0), 'X', "stickBlaze", 'Z', "ingotBrass"
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.shitirin, 1, 0), new Object[] {
				"XXX", "XYX", "XXX", 'Y', new ItemStack(Blocks.FURNACE, 1, 0), 'X', new ItemStack(Items.CLAY_BALL, 1, 0)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.fuelStove, 1, 0), new Object[] {
				"XYX", "XZX", "XWX", 'X', "ingotSteel", 'Y', new ItemStack(Items.FLINT_AND_STEEL, 1, 32767), 'Z',
				new ItemStack(Blocks.FURNACE, 1, 0), 'W', new ItemStack(Items.BUCKET, 1, 0)
		});

		DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.bellow, 1, 0), new Object[] {
				"XYX", "XZX", "XWX", 'X', "ingotIron", 'Y', "stickWood", 'Z', "gearWood", 'W',
				new ItemStack(Blocks.PISTON, 1, 0)
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.repairPutty, 1, 0), new Object[] {
				new ItemStack(Items.SLIME_BALL, 1, 0), "dustIron"
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.repairPutty, 1, 1), new Object[] {
				new ItemStack(Items.CLAY_BALL, 1, 0), "dustGarnet"
		});

		DCRecipe.addShapelessRecipe(res.getRecipeName(), new ItemStack(MainInit.repairPutty, 1, 1), new Object[] {
				"dustClay", "dustGarnet"
		});

		if (ModuleConfig.machine) {
			DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.scope, 1, 0), new Object[] {
					"X", "Y", "Z", 'X', new ItemStack(DCInit.climate_checker, 1, 0), 'Y',
					new ItemStack(MachineInit.torqueChecker, 1, 0), 'Z', "ingotSteel"
			});

			DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.entityScope, 1, 0), new Object[] {
					"X", "Y", "Z", 'X', "gemMalachite", 'Y', new ItemStack(MachineInit.torqueChecker, 1, 0), 'Z',
					"ingotSteel"
			});
		} else {
			DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.scope, 1, 0), new Object[] {
					"X", "Y", "Z", 'X', new ItemStack(Blocks.GLASS_PANE, 1, 0), 'Y',
					new ItemStack(DCInit.climate_checker, 1, 0), 'Z', "ingotSteel"
			});

			DCRecipe.addShapedRecipe(res.getRecipeName(), new ItemStack(MainInit.entityScope, 1, 0), new Object[] {
					"X", "Y", "Z", 'X', "gemMalachite", 'Y', new ItemStack(DCInit.climate_checker, 1, 0), 'Z',
					"ingotSteel"
			});
		}
	}

}