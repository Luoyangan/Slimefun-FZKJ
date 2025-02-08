package me.luoyangan.yubatechnology.tasks;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import me.luoyangan.yubatechnology.Items;
import me.luoyangan.yubatechnology.utils.SfUtils;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemRegisterTask {
    public static void run() {
        ItemStack[] crazyDiamond = new ItemStack[]{null, null, null, new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.DIAMOND), new ItemStack(Material.GOLD_INGOT), null, null, null}

        SfUtils.registerIten("CRAZY_DIAMDND", Items.CRAZY_DIAMDND, Items.YSZL_STUFF, RecipeType.ENHANCED_CRAFTING_TABLE, crazyDiamond);
    }
}
