
package net.deathcon.craftfinder.item;

@CraftfinderModElements.ModElement.Tag
public class DragonScaleBronzeItem extends CraftfinderModElements.ModElement {

	@ObjectHolder("craftfinder:dragon_scale_bronze")
	public static final Item block = null;

	public DragonScaleBronzeItem(CraftfinderModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.BREWING).maxStackSize(64));
			setRegistryName("dragon_scale_bronze");
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
