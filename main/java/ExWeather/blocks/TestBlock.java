package ExWeather.blocks;

import ExWeather.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;


public class TestBlock extends BlockExWeather
{
    public TestBlock()
    {
        this.setBlockName(Strings.TestBlockName);
        this.setHardness(1f);
        this.setResistance(3f);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setStepSound(Block.soundTypeCloth);
        ModBlocks.register(this);

    }
}
