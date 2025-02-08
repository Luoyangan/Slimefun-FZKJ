package me.luoyangan.yubatechnology;


import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import me.luoyangan.yubatechnology.tasks.ItemRegisterTask;
import org.bukkit.plugin.java.JavaPlugin;

public class YubaTechnology extends JavaPlugin implements SlimefunAddon {
    private static YubaTechnology instance;

    public JavaPlugin getJavaPlugin() {
        return this;
    }

    public String getBugTrackerURL() {
        return "https://luoyangmc.rth1.xyz/";
    }

    @Override
    public void onEnable() {
        instance = this;

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // 这里添加自动更新功能
        }

        ItemRegisterTask.run();
    }

    public static YubaTechnology getInstance() {
        return instance;
    }
}
