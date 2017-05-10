package com.ayc.rgi.handler;

import java.io.File;

import com.ayc.rgi.utility.LogHelper;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	
		public static Configuration config;
		
		//Initializers
        public static boolean debug;
		
        
        
        
		public static void init(File file) 
		{
			config = new Configuration(file);
			config.load();
        
			//Misc
			debug = config.get("Misc", "Debug", false).getBoolean();
        
			
			
			
			
			
			
			
			
			
			if (debug == true)
			{
				LogHelper.info(debug + " : DEBUG MODE ON");
			}
			
			if (config.hasChanged()) 
			{
				config.save();
			}
		}
}
