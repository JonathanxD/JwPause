package me.therealbuggy.JwPause.commands;

import me.therealbuggy.JwPause.JwPause;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class PauseExecutor implements CommandExecutor {

	private final JwPause jw;
	
	public PauseExecutor(JwPause jw) {
		this.jw = jw;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
        jw.togglePause();
		return true;
	}
		
}
