package com.artist.scrapper.cercanias;

public class MadridCercaniasTSScrapper extends AbstractCercaniasScrapper
{

    @Override
    public String getServiceId()
    {
        return "CERCANIAS_MADRID";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Madrid";
    }

    @Override
    protected String getKernel()
    {
        return "10";
    }

    public MadridCercaniasTSScrapper()
    {
    }
}
