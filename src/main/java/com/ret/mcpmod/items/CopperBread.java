package com.ret.mcpmod.items;

import com.ret.mcpmod.group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CopperBread extends Item {
    public static final Food food = new Food.Builder()
            .saturationMod(2)
            .nutrition(2)
            .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 2), 1)
            .effect(() -> new EffectInstance(Effects.CONFUSION, 10 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.DAMAGE_RESISTANCE, 20 * 20, 1), 1)
            .build();

    public CopperBread() {
        super(new Properties().food(food).tab(ModGroup.itemGroup));
    }
}
