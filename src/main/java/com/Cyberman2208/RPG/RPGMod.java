package com.Cyberman2208.RPG;

import com.Cyberman2208.RPG.creativetab.RPGTab;
import com.Cyberman2208.RPG.init.RegistrationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class RPGMod
{


    private static Logger logger;
    public final static CreativeTabs RPGTab = new RPGTab();
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        logger = event.getModLog();
        RegistrationHandler.init();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        //logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
    public static Logger getLogger()
    {
        return logger;
    }
}
