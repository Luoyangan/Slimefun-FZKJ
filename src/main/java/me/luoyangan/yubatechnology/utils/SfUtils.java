package me.luoyangan.yubatechnology.utils;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import jdk.jfr.Category;
import org.bukkit.inventory.ItemStack;

public class SfUtils {
    public static void registerIten(String id, ItemStack item, Category category, RecipeType rt, ItemStack[] recipe) {
        SlimefunItemStack sis = new SlimefunItemStack(id, item);
        SlimefunItem sfi = new SlimefunItem(category, sis, rt, recipe);
        sfi.register(SlimefunTutorial.getInstance());
    }
}
