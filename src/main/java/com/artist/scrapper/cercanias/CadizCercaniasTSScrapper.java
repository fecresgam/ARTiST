package com.artist.scrapper.cercanias;

public class CadizCercaniasTSScrapper extends AbstractCercaniasScrapper
{

    @Override
    public String getServiceId()
    {
        return "CERCANIAS_CADIZ";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas C\u00E1diz";
    }

    @Override
    protected String getKernel()
    {
        return "31";
    }

    public CadizCercaniasTSScrapper()
    {
    }
}
