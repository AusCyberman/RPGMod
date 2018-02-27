package com.Cyberman2208.RPG.creativetab;

import com.Cyberman2208.RPG.init.RPGBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class RPGTab extends CreativeTabs {

    public RPGTab(){
        super("RPG");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(RPGBlocks.testingblock);
    }
}
