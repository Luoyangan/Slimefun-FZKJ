package me.luoyangan.yubatechnology;

import jdk.jfr.Category;
import me.mrCookieSlime.CSCoreLibPlugin.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Items {
    //分类
    public static Category YSZL_FZKJ = new Category(new NamespacedKey(SlimefunTutorial.getInstance(), "CRAZY_STUFF"), new CustomItem(Material.DIAMOND, "&f嗡嗡嗡"));

    //物品
    public static ItemStack YSZL_FZKJ_WP_DIANOND = new CustomItem(Material.DIAMOND, "&e钻石", "&7666");
}
