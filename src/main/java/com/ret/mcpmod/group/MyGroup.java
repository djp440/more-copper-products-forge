package com.ret.mcpmod.group;

import com.ret.mcpmod.items.ItemRegistry;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MyGroup extends ItemGroup {
    public MyGroup() {
        super("mcp_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.copperBread.get());
    }
}
