package me.CID.discordbot.object;

import java.util.List;

import sx.blah.discord.api.ClientBuilder;
import sx.blah.discord.api.IDiscordClient;
import sx.blah.discord.util.DiscordException;

public class Bot {

	IDiscordClient bot;	
	CommandManager commands;
	
	public Bot(String token) {
		bot = createClient(token);
		commands = new CommandManager("!");
		bot.getDispatcher().registerListener(commands);
	}
	
	public void addCommand(Command command) {
		commands.addCommand(command);
	}
	
	public CommandManager getCommandsManager() {
		return commands;
	}
	
	private IDiscordClient createClient(String token) {
		ClientBuilder clientBuilder = new ClientBuilder();
		clientBuilder.withToken(token);
		try {
			return clientBuilder.login();
		} catch (DiscordException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
