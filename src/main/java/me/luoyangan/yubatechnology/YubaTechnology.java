package me.luoyangan.yubatechnology;


import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class YubaTechnology extends JavaPlugin implements SlimefunAddon {
    private static YubaTechnology instance;

    @Override
    public void onEnable() {
        instance =this;

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // 这里添加自动更新功能
        }
    }

    @Override
    public void onDisable() {
        // 禁用插件的逻辑...
    }

    @Override
    public String getBugTrackerURL() {
        return "https://luoyangmc.rth1.xyz/";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public static YubaTechnology getInstance() {
        return instance;
    }
}
