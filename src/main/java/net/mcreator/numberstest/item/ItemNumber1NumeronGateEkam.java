
package net.mcreator.numberstest.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;

import net.mcreator.numberstest.creativetab.TabNumberCards;
import net.mcreator.numberstest.ElementsNumberstestMod;

@ElementsNumberstestMod.ModElement.Tag
public class ItemNumber1NumeronGateEkam extends ElementsNumberstestMod.ModElement {
	@GameRegistry.ObjectHolder("numberstest:number_1_numeron_gate_ekam")
	public static final Item block = null;
	public ItemNumber1NumeronGateEkam(ElementsNumberstestMod instance) {
		super(instance, 171);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("numberstest:number_1_numeron_gate_ekam", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("number_1_numeron_gate_ekam");
			setRegistryName("number_1_numeron_gate_ekam");
			setCreativeTab(TabNumberCards.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}
	}
}
