package me.itsnathang.bossbarmessage;

import me.itsnathang.bossbarmessage.commands.CommandHandler;
import me.itsnathang.bossbarmessage.util.BossBarHandler;
import me.itsnathang.bossbarmessage.config.ConfigManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BossBarMessage extends JavaPlugin {
    public static BossBarMessage plugin;

    @Override
    public void onEnable() {
        this.getLogger().info("Hello world!");

        plugin = this;

        getCommand("bossbarmessage").setExecutor(new CommandHandler(this));

        // Initialize Configuration Manager
        new ConfigManager(this);
        new BossBarHandler(this);
    }

}