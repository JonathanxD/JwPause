package me.therealbuggy.JwPause;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

import me.therealbuggy.JwPause.commands.PauseExecutor;
import me.therealbuggy.JwPause.configuration.Configuration;
import me.therealbuggy.JwPause.events.PauseEvent;
import me.therealbuggy.JwPause.events.ResumeEvent;
import me.therealbuggy.JwPause.listener.JPauseListener;

import me.therealbuggy.JwPause.metadata.TimeData;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class JwPause extends JavaPlugin {
	private boolean pauseServer = false;
	private final HashMap<World, TimeData> times = new HashMap<>();
    private Configuration configuration;

	@Override
	public void onEnable() {
        getLogger().info("Registrando comandos...");
		getCommand("pause").setExecutor(new PauseExecutor(this));
        getLogger().info("Registrando listeners...");
		getServer().getPluginManager().registerEvents(new JPauseListener(this), this);
        getLogger().info("Configurando schedulers...");
		setupScheduler();
        getLogger().info("Salvando config...");
        saveDefaultConfig();
        getLogger().info("Carregando config...");
        configuration = new Configuration(getConfig());
        getLogger().info("Plugin habilitado!");
	}
	
	private void setupScheduler() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			
			@Override
			public void run() {
				if(pauseServer){//Double check securiy: synchronized time can bug
					for(World w : Bukkit.getWorlds()){
                        TimeData timeData = null;
						if(!times.containsKey(w)){
                            timeData = new TimeData(w.hasStorm(), w.isThundering(), w.getThunderDuration(), w.getWeatherDuration(), w.getFullTime());
							times.put(w, timeData);
						}
                        if(timeData == null){
                            timeData = times.get(w);
                        }

						w.setFullTime(timeData.getTime());
                        w.setStorm(timeData.hasStorm());
                        w.setThundering(timeData.isThundering());
                        w.setThunderDuration(timeData.getThunderTime());
                        w.setWeatherDuration(timeData.getWeatherTime());
					}
				}else{
					if(!times.isEmpty() && !pauseServer){//Double check securiy: synchronized time can bug
						times.clear();
					}
				}
				
			}
		}, 20L, 20L);
		
	}

	@Override
	public void onDisable() {
		
		HandlerList.unregisterAll(this);
	}

    private Configuration getConfiguration() {
        return configuration;
    }

    public boolean isPauseServer() {
        return pauseServer;
    }

    public void togglePause(){
        pauseServer = !pauseServer;
        if (pauseServer) {
            for(World world : Bukkit.getWorlds()){
                world.save();
            }
            PauseEvent pauseEvent;
            Bukkit.getPluginManager().callEvent(pauseEvent = new PauseEvent());

            if(pauseEvent.isCancelled()) {
                pauseServer = false;
            } else {
                Bukkit.broadcastMessage(getConfiguration().getMensagemPausar());
            }
        } else {
            ResumeEvent resumeEvent;
            Bukkit.getPluginManager().callEvent(resumeEvent = new ResumeEvent());

            if(resumeEvent.isCancelled()) {
                pauseServer = true;
            } else {
                Bukkit.broadcastMessage(getConfiguration().getMensagemDespausar());
            }
        }
    }
}
