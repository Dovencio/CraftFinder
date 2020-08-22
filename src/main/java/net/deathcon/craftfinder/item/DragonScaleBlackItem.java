
package net.deathcon.craftfinder.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.deathcon.craftfinder.CraftfinderModElements;

@CraftfinderModElements.ModElement.Tag
public class DragonScaleBlackItem extends CraftfinderModElements.ModElement {
	@ObjectHolder("craftfinder:dragon_scale_black")
	public static final Item block = null;
	public DragonScaleBlackItem(CraftfinderModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.BREWING).maxStackSize(64));
			setRegistryName("dragon_scale_black");
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
	}
}
