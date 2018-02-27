package com.Cyberman2208.RPG.block;

import com.Cyberman2208.RPG.RPGMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockTest extends Block {
    @Override
    public boolean isFullBlock(IBlockState state) { return false; }

    @Override
    public boolean isFullCube(IBlockState state) { return false; }

    @Override
    public boolean isOpaqueCube(IBlockState state) { return false; }

    public BlockTest() {
        super(Material.PORTAL);
        setUnlocalizedName("testingblock");
        setRegistryName("testing_block");
    setCreativeTab(RPGMod.RPGTab);


    }
}