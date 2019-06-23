package tk.shanebee.survival.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

@SuppressWarnings("unused")
public class WaterBowlFillEvent extends Event implements Cancellable {

	private static HandlerList handlers = new HandlerList();
	private ItemStack item;
	private boolean isCancelled;

	public WaterBowlFillEvent(ItemStack item) {
		this.item = item;
		this.isCancelled = false;
	}

	public ItemStack getWaterBowl() {
		return this.item;
	}

	@SuppressWarnings("NullableProblems")
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

	public static HandlerList getHandlerList() {
		return handlers;
	}

	@Override
	public boolean isCancelled() {
		return isCancelled;
	}

	@Override
	public void setCancelled(boolean b) {
		this.isCancelled = b;
	}

}
