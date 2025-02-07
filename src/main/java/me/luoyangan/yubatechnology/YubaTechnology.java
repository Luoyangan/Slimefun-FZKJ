package me.luoyangan.yubatechnology;


import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import org.bukkit.plugin.java.JavaPlugin;

public class YubaTechnology extends JavaPlugin implements SlimefunAddon {
    private static YubaTechnology instance;

    @Override
    public void onEnable() {
        instance =this;

        // 从 config.yml 中读取插件配置
        Config cfg = new Config(this);
        if (cfg.getBoolean("options.auto-update")) {
            // 可以在这里添加自动更新功能
        }
    }

    @Override
    public void onDisable() {
        // 禁用插件的逻辑...
    }

    @Override
    public String getBugTrackerURL() {
        // 这里返回你的问题追踪器的网址，而不是 null
        return "https://luoyangmc.rth1.xyz/";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        /*
         * 你需要返回对你插件的引用。
         * 如果这是你插件的主类，只需要返回 "this" 即可。
         */
        return this;
    }

    public static YubaTechnology getInstance() {
        return instance;
    }
}
