
package net.deathcon.craftfinder.item;

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
