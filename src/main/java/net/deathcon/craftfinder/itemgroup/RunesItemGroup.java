
package net.deathcon.craftfinder.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.deathcon.craftfinder.item.UnmarkedrunstoneItem;
import net.deathcon.craftfinder.CraftfinderModElements;

@CraftfinderModElements.ModElement.Tag
public class RunesItemGroup extends CraftfinderModElements.ModElement {
	public RunesItemGroup(CraftfinderModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrunes") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UnmarkedrunstoneItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
