package net.illager.mojang;

import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.author.Author;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.JavaPlugin;

@Plugin(name = "MojangAPI", version = "1.0.0-beta")
@Description("Serves as a wrapper for the Mojang API. This plugin has no inate functionality.")
@Author("Illager Net")
@Website("https://illager.net")
@ApiVersion(ApiVersion.Target.v1_13)
public class MojangAPIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Not used
    }

    @Override
    public void onDisable() {
        // Not used
    }
}
