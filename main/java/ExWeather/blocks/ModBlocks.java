package ExWeather.blocks;

import ExWeather.ExWeather;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class ModBlocks
{
    public static Block testBlock;
        
    public static void init()
    {
        testBlock = new TestBlock();
    }
        

    public static void register(BlockExWeather block)
    {
        GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
    }
}