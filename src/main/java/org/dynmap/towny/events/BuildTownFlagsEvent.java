package org.dynmap.towny.events;


import com.sun.istack.internal.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import ru.etysoft.aurorauniverse.world.Town;


import java.util.List;

/**
 * Called when
 */
public class BuildTownFlagsEvent extends Event {
    private static HandlerList handlers = new HandlerList();
    private final Town town;
    private final List<String> flags;

    public BuildTownFlagsEvent(Town town, List<String> flags) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.town = town;
        this.flags = flags;
    }

    public Town getTown() {
        return town;
    }

    public List<String> getFlags() {
        return flags;
    }

    @NotNull
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
