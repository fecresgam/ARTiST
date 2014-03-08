package com.artist.scrapper.cercanias;

public class BarcelonaCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_BARCELONA";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Barcelona";
    }


    @Override
    protected String getKernel()
    {
        return "50";
    }

    public BarcelonaCercaniasTSScrapper()
    {
    }
}
