package com.no.basic.mod.item;

import com.no.basic.mod.NoBasic;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup COIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(NoBasic.MOD_ID, "coin"),
            FabricItemGroup.builder().displayName(Text.translatable("intemgroup.coin"))
                    .icon(() -> new ItemStack(ModItems.coin)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COIN);


                    }).build());

    public static void registerItemGroups(){
        NoBasic.LOGGER.info("Registering Item Groups for" +NoBasic.MOD_ID);
    }
}
