package ExWeather.items;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ExWeather.lib.References;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by MinijackB on 11/04/2014.
 */
public class ItemExWeather extends Item
{
    public String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        this.itemIcon = iconRegister.registerIcon(References.RESOURCESPREFIX + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}
