package com.ret.mcpmod.items;

import com.ret.mcpmod.Utils;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    //通过DeferredRegister注册Item
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);

    //register(itemId,item)
    public static final RegistryObject<Item> copperBread = ITEMS.register("copper_bread", CopperBread::new);
}
