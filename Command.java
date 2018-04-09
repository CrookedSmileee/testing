package me.CID.discordbot.object;

import java.util.List;

import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

public interface Command {
	public String getLabel();
	public String getDescription();
	
	public void runCommand(IUser user, IChannel channel, IGuild guild, String label, List<String> args);
	
	
	
}
