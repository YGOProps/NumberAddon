
package net.mcreator.numberstest.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.numberstest.item.ItemNumber27;
import net.mcreator.numberstest.ElementsNumberstestMod;

@ElementsNumberstestMod.ModElement.Tag
public class TabNumberCards extends ElementsNumberstestMod.ModElement {
	public TabNumberCards(ElementsNumberstestMod instance) {
		super(instance, 159);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabnumber_cards") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemNumber27.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
