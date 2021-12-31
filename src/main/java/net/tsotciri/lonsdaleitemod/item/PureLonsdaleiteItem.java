
package net.tsotciri.lonsdaleitemod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class PureLonsdaleiteItem extends Item {
	public PureLonsdaleiteItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("pure_lonsdaleite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
