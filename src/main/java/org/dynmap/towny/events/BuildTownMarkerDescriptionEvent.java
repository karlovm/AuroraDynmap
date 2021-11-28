package org.dynmap.towny.events;


import com.sun.istack.internal.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import ru.etysoft.aurorauniverse.world.Town;

public class BuildTownMarkerDescriptionEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Town town;
    private String description;

    public BuildTownMarkerDescriptionEvent(Town town, String description) {
        super(!Bukkit.getServer().isPrimaryThread());
        this.town = town;
        this.description = description;
    }

    public Town getTown() {
        return town;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
