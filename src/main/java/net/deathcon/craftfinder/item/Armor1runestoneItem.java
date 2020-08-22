
package net.deathcon.craftfinder.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.deathcon.craftfinder.itemgroup.RunesItemGroup;
import net.deathcon.craftfinder.CraftfinderModElements;

import java.util.List;

@CraftfinderModElements.ModElement.Tag
public class Armor1runestoneItem extends CraftfinderModElements.ModElement {
	@ObjectHolder("craftfinder:armor_1runestone")
	public static final Item block = null;
	public Armor1runestoneItem(CraftfinderModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RunesItemGroup.tab).maxStackSize(64));
			setRegistryName("armor_1runestone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Adds 1 AC to armor"));
		}
	}
}
