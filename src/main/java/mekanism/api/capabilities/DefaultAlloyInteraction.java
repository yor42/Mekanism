package mekanism.api.capabilities;

import mekanism.api.IAlloyInteraction;
import mekanism.api.capabilities.DefaultStorageHelper.NullStorage;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class DefaultAlloyInteraction implements IAlloyInteraction
{
	@Override
	public void onAlloyInteraction(EntityPlayer player, EnumHand hand, ItemStack stack, int tierOrdinal) {}

	public static void register()
	{
        CapabilityManager.INSTANCE.register(IAlloyInteraction.class, new NullStorage<>(), DefaultAlloyInteraction.class);
	}
}