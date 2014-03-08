package com.artist.scrapper.cercanias;

public class SevillaCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_SEVILLA";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Sevilla";
    }

    @Override
    protected String getKernel()
    {
        return "30";
    }

    public SevillaCercaniasTSScrapper()
    {
    }
}
