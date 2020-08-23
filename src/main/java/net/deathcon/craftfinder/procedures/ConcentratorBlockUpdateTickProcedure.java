package net.deathcon.craftfinder.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.deathcon.craftfinder.item.DragonScaleWhiteItem;
import net.deathcon.craftfinder.item.DragonScaleRedItem;
import net.deathcon.craftfinder.item.DragonScaleGreenItem;
import net.deathcon.craftfinder.item.DragonScaleCopperItem;
import net.deathcon.craftfinder.item.DragonScaleBronzeItem;
import net.deathcon.craftfinder.item.DragonScaleBrassItem;
import net.deathcon.craftfinder.item.DragonScaleBlackItem;
import net.deathcon.craftfinder.CraftfinderModElements;

import java.util.function.Supplier;
import java.util.Map;

@CraftfinderModElements.ModElement.Tag
public class ConcentratorBlockUpdateTickProcedure extends CraftfinderModElements.ModElement {
	public ConcentratorBlockUpdateTickProcedure(CraftfinderModElements instance) {
		super(instance, 18);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure ConcentratorBlockUpdateTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack Slot0 = ItemStack.EMPTY;
		ItemStack Slot1 = ItemStack.EMPTY;
		Slot0 = (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0)));
		Slot1 = (new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (1)));
		if (((Slot0).getItem() == new ItemStack(DragonScaleRedItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing00", (1 + ((Slot1).getOrCreateTag().getDouble("Ing00"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleRedItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing01", (1 + ((Slot1).getOrCreateTag().getDouble("Ing01"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleBlackItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing02", (1 + ((Slot1).getOrCreateTag().getDouble("Ing02"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleGreenItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing03", (1 + ((Slot1).getOrCreateTag().getDouble("Ing03"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleWhiteItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing05", (1 + ((Slot1).getOrCreateTag().getDouble("Ing05"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleBrassItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing05", (1 + ((Slot1).getOrCreateTag().getDouble("Ing05"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleBronzeItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing06", (1 + ((Slot1).getOrCreateTag().getDouble("Ing06"))));
		} else if (((Slot0).getItem() == new ItemStack(DragonScaleCopperItem.block, (int) (1)).getItem())) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (1));
							_current.detectAndSendChanges();
						}
					}
				}
			}
			(Slot1).getOrCreateTag().putDouble("Ing07", (1 + ((Slot1).getOrCreateTag().getDouble("Ing07"))));
		}
	}
}
