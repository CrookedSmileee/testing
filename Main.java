package me.CID.discordbot;

import java.util.List;

import me.CID.discordbot.object.Bot;
import me.CID.discordbot.object.Command;
import sx.blah.discord.handle.obj.IChannel;
import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IUser;

public class Main {

	public static Bot bot;
	
	public static void main(String[] args) {
		bot = new Bot("NDMyOTAzNTg1Nzc3NDUxMDM5.Da0EbA.phsan0-N5KBcWIKPwLKICz2hK_Q");
		
		bot.addCommand(new Command() {

		
			
			@Override
			public String getLabel() {
				// TODO Auto-generated method stub
				return "help";
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "The help command";
			}
			
			@Override
			public void runCommand(IUser user, IChannel channel, IGuild guild, String label, List<String> args) {
				// TODO Auto-generated method stub
				String helpMessage = "...   **Help**   ...\n\n";
				
				for (Command command : bot.getCommandsManager().getCommands()){
					String l = command.getLabel();
					String d = command.getDescription();
					
					helpMessage += "   **" + bot.getCommandsManager().getPrefix() + l + "**\n";
					helpMessage += "     -" + d + "\n\n";
		}
				
				user.getOrCreatePMChannel().sendMessage(helpMessage);
			}
			
		});
		bot.addCommand(new Command() {
			
			@Override
			public String getLabel() {
				// TODO Auto-generated method stub
				return "ping";
			}
			
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return "Ping the server to get a pong return.";
			}
			
			@Override
			public void runCommand(IUser user, IChannel channel, IGuild guild, String label, List<String> args) {
				// TODO Auto-generated method stub
				channel.sendMessage("pong");
				
			}
			
		});
	}
}
