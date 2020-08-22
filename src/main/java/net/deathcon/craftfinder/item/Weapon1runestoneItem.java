
package net.deathcon.craftfinder.item;

@CraftfinderModElements.ModElement.Tag
public class Weapon1runestoneItem extends CraftfinderModElements.ModElement {

	@ObjectHolder("craftfinder:weapon_1runestone")
	public static final Item block = null;

	public Weapon1runestoneItem(CraftfinderModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(RunesItemGroup.tab).maxStackSize(64));
			setRegistryName("weapon_1runestone");
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
