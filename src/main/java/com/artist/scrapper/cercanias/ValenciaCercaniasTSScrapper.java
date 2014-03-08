package com.artist.scrapper.cercanias;

public class ValenciaCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_VALENCIA";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Valencia";
    }

    @Override
    protected String getKernel()
    {
        return "40";
    }

    public ValenciaCercaniasTSScrapper()
    {
    }
}
