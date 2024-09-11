import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.World;


public class PlayerSleepListener implements Listener {



    @EventHandler
    public void onPlayerBedEnter(PlayerBedEnterEvent event) {
        World world = event.getPlayer().getWorld();
        if (event.getBedEnterResult() == PlayerBedEnterEvent.BedEnterResult.OK) {
            isPlayerSleeping.put(world, true); // Disable time adjustment
        }
    }

    @EventHandler
    public void onPlayerBedLeave(PlayerBedLeaveEvent event) {
        World world = event.getPlayer().getWorld();
        isPlayerSleeping.put(world, false); // Re-enable time adjustment
    }
}
