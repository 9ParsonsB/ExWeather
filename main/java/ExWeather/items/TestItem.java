package ExWeather.items;

import ExWeather.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class TestItem extends ItemExWeather
{
    public TestItem()
    {
        this.setUnlocalizedName(Strings.TestItemName);
        this.setCreativeTab(CreativeTabs.tabRedstone);
        ModItems.register(this);
    }

    /**@Override
    public void onItemRightClick()
    {
        player.sendChatMessage(new ChatComponentText(World.isRaining().toString()));
    }
    */
}
