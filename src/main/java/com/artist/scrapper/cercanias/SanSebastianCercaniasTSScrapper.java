package com.artist.scrapper.cercanias;

public class SanSebastianCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_SANSEBASTIAN";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas San Sebastian";
    }

    @Override
    protected String getKernel()
    {
        return "61";
    }

    public SanSebastianCercaniasTSScrapper()
    {
    }
}
