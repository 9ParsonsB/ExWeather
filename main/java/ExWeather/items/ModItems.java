package ExWeather.items;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems
{
    public static Item testItem;

    public static void init()
    {
        testItem = new TestItem();

    }

    public static void register(ItemExWeather item)
    {
        GameRegistry.registerItem(item, item.getUnwrappedUnlocalizedName(item.getUnlocalizedName()));
    }
}
