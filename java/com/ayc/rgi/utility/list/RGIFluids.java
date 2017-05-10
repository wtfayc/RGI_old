package com.ayc.rgi.utility.list;

import com.ayc.rgi.utility.Reference;

import net.minecraftforge.fluids.Fluid;

public enum RGIFluids {

	COMPRESSED_AIR("air_compressed", 0, 100, 200, 295, true, false, "AirCompressed"),
	SLAG("slag", 0, 1000, 1000, 295, false, false, "Slag"),
	HOT_METAL("hotmetal", 0, 1000, 1000, 295, false, false, "HotMetal"),
	
	;
	public String fluidName;
	public int luminosity;
	public int density;
	public int viscosity;
	public int temperature;
	public boolean isGaseous;
	public boolean hasCell;
	public String fluidNameCapitalized;
	
	public String fluidTexture;
	public Fluid fluid;
	
	private RGIFluids (String fluidName, int luminosity, int density, int viscosity, int temperature, boolean isGaseous, boolean hasCell, String fluidNameCapitalized)
	{
		this.fluidName = fluidName;
		this.luminosity = luminosity;
		this.density = density;
		this.viscosity = viscosity;
		this.temperature = temperature;
		this.isGaseous = isGaseous;
		this.hasCell = hasCell;
		this.fluidNameCapitalized = fluidNameCapitalized;
		this.fluidTexture = Reference.TEXTURE_PATH + "fluids/" + fluidNameCapitalized;
	}
	
	public Fluid getFluid ()
	{
		return new Fluid(this.fluidName).setUnlocalizedName(this.fluidName).setLuminosity(this.luminosity).setDensity(this.density)
			.setViscosity(this.viscosity).setTemperature(this.temperature).setGaseous(this.isGaseous);
	}
}
