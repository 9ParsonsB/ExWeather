package ExWeather;

import ExWeather.blocks.ModBlocks;
import ExWeather.core.handler.CraftingHandler;
import ExWeather.core.proxy.CommonProxy;
import ExWeather.items.ModItems;
import ExWeather.lib.References;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static cpw.mods.fml.common.Mod.EventHandler;

@Mod(modid = References.MODID, name = References.MODNAME, version = References.VERSION)

public class ExWeather
{

    @SidedProxy(clientSide = References.CLIENTPROXYLOCATION, serverSide = References.COMMONPROXYLOCATION)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        ModItems.init();
        CraftingHandler.init();
    }

    @EventHandler
    public static void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {

    }

}
