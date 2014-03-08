package com.artist.scrapper.cercanias;

public class BilbaoCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_BILBAO";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Bilbao";
    }

    @Override
    protected String getKernel()
    {
        return "60";
    }

    public BilbaoCercaniasTSScrapper()
    {
    }
}
