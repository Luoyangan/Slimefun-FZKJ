package me.luoyangan.yubatechnology;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

public class YubaTechnology extends JavaPlugin implements SlimefunAddon {

    @Override
    public void onEnable() {
        // 从 config.yml 中读取插件配置
        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update")) {
            // 你可以在这里添加自动更新功能
        }

        /*
         * 1. 创建分类
         * 分类的显示物品将使用以下物品
         */
        ItemStack itemGroupItem1 = new CustomItemStack(Material.DIAMOND, "&x&e&f&7&1&f&2腐&x&e&e&9&6&c&6竹&x&e&d&b&a&9&a科&x&e&c&d&f&6&e技");

        // 给分类提供一个独一无二的ID
        NamespacedKey itemGroupId1 = new NamespacedKey(this, "addon_category");
        ItemGroup itemGroup1 = new ItemGroup(itemGroupId1, itemGroupItem1);

        /*
         * 2. 创建第二个分类
         * 分类的显示物品将使用以下物品
         */
        ItemStack itemGroupItem2 = new CustomItemStack(Material.GOLD_INGOT, "&x&f&f&a&5&0&0黄&x&f&f&b&5&2&0金&x&f&f&c&5&4&0科&x&f&f&d&5&6&0技");

        // 给第二个分类提供一个独一无二的ID
        NamespacedKey itemGroupId2 = new NamespacedKey(this, "another_addon_category");
        ItemGroup itemGroup2 = new ItemGroup(itemGroupId2, itemGroupItem2);

        /*
         * 2. 创建一个 SlimefunItemStack
         * 这个类是 ItemStack 的扩展，拥有多个构造函数
         * 重要：每个物品都得有一个独一无二的ID
         */
        SlimefunItemStack slimefunItem1 = new SlimefunItemStack("COOL_DIAMOND", Material.DIAMOND, "&d炫酷的钻石", "&c+1000% 炫酷");

        /*
         * 3. 创建配方
         * 这个配方是一个拥有9个ItemStack的数组。
         * 它代表了一个3x3的有序合成配方。
         * 该配方所需的机器将在后面通过RecipeType指定。
         */
        ItemStack[] recipe1 = {
                new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD),
                null, new ItemStack(Material.DIAMOND), null,
                new ItemStack(Material.EMERALD), null, new ItemStack(Material.EMERALD)
        };

        /*
         * 4. 注册物品
         * 现在，你只需要注册物品
         * RecipeType.ENHANCED_CRAFTING_TABLE 代表
         * 该物品将在增强型工作台中合成。
         * 来自粘液科技本体的配方类型将会自动将配方添加到对应的机器中。
         */
        SlimefunItem item1 = new SlimefunItem(itemGroup1, slimefunItem1, RecipeType.ENHANCED_CRAFTING_TABLE, recipe1);

        item1.register(this);

        SlimefunItemStack slimefunItem2 = new SlimefunItemStack("ITEM_2", Material.GOLDEN_SWORD, "&x&f&f&a&5&0&0黄金剑");
        ItemStack[] recipe2 = {
                new ItemStack(Material.GOLD_INGOT), null, new ItemStack(Material.GOLD_INGOT),
                null, new ItemStack(Material.STICK), null,
                null, new ItemStack(Material.STICK), null
        };
        SlimefunItem item2 = new SlimefunItem(itemGroup2, slimefunItem2, RecipeType.ENHANCED_CRAFTING_TABLE, recipe2);
        item2.register(this);
    }

    @Override
    public void onDisable() {
        // 禁用插件的逻辑...
    }

    @Override
    public String getBugTrackerURL() {
        // 你可以在这里返回你的问题追踪器的网址，而不是 null
        // Bug 修复：将 https 改为 "https"
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

}
