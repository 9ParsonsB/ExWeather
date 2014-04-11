package ExWeather.core.handler;

import ExWeather.blocks.ModBlocks;
import ExWeather.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

/**
 * Created by MinijackB on 11/04/2014.
 */
public class CraftingHandler
{
    public static void init()
    {
        registerRecipes();
    }

    public static void registerRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(ModItems.testItem), " N", "S ", 'N', Items.nether_star, 'S', Items.stick);
    }
}
