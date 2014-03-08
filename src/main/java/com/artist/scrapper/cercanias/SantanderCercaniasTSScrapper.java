package com.artist.scrapper.cercanias;

public class SantanderCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_SANTANDER";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Santander";
    }

    @Override
    protected String getKernel()
    {
        return "62";
    }

    public SantanderCercaniasTSScrapper()
    {
    }
}
