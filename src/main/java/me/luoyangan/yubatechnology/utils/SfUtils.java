package me.luoyangan.yubatechnology.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class SfUtils {
    public static void registerIten(String id, ItemStack item) {
        SlimefunItemStack sis = new SlimefunItemStack(id, item);

    }
}
