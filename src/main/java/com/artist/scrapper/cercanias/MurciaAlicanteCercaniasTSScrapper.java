package com.artist.scrapper.cercanias;

public class MurciaAlicanteCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_MURCIAALICATE";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Murcia/Alicante";
    }

    @Override
    protected String getKernel()
    {
        return "41";
    }

    public MurciaAlicanteCercaniasTSScrapper()
    {
    }
}
