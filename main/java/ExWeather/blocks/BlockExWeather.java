
package ExWeather.blocks;
        
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import ExWeather.lib.References;
        import net.minecraft.block.Block;
        import net.minecraft.block.material.Material;
        import net.minecraft.client.renderer.texture.IIconRegister;

        
public class BlockExWeather extends Block {

    public BlockExWeather() {
        super(Material.rock);
    }

    public BlockExWeather(Material material) {
        super(material);
    }


    public String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", References.RESOURCESPREFIX, getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon(References.RESOURCESPREFIX + getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
}