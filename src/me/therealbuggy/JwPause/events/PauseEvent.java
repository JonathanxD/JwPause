package me.therealbuggy.JwPause.events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by jonathan on 28/12/15.
 */

/**
 * Este evento é chamado antes da mensagem!
 * Caso este evento seja cancelado o servidor não será pausado
 */
public class PauseEvent extends Event implements Cancellable {
    private static final HandlerList handlerList = new HandlerList();
    private boolean cancelled;

    @Override
    public String getEventName() {
        return "PauseEvent";
    }

    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean b) {
        this.cancelled = b;
    }
}
