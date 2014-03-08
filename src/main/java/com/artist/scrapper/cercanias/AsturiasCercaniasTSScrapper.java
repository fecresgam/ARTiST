package com.artist.scrapper.cercanias;

public class AsturiasCercaniasTSScrapper extends AbstractCercaniasScrapper
{

    @Override
    public String getServiceId()
    {
        return "CERCANIAS_ASTURIAS";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Asturias";
    }

    @Override
    protected String getKernel()
    {
        return "20";
    }

    public AsturiasCercaniasTSScrapper()
    {
    }

}
