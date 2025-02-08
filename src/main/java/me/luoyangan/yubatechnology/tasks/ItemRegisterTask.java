package me.luoyangan.yubatechnology.tasks;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import me.luoyangan.yubatechnology.Items;
import me.luoyangan.yubatechnology.utils.SfUtils;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class ItemRegisterTask {
    public static void run() {
        //配方
        ItemStack[] crazyDiamond = new ItemStack[]{null, null, null, new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.DIAMOND), new ItemStack(Material.GOLD_INGOT), null, null, null};

        SfUtils.registerIten("CRAZY_DIAMDND", Items.CRAZY_DIAMDND, Items.YSZL_FZKJ, RecipeType.ENHANCED_CRAFTING_TABLE, crazyDiamond);

        //研究
        Research rsl = new Research(new NamespacedKey(SlimefnTutoriaLl.getInstance(), "CRAZY_DIAMDND"), 8001, "付款证书", 10);
        rsl.addItems(SlimefunItem.getByItem(Items.CRAZY_DIAMOND));
        rsl.register();
        //注册
    }
}
