package com.artist.scrapper.cercanias;

public class MalagaCercaniasTSScrapper extends AbstractCercaniasScrapper
{

    @Override
    public String getServiceId()
    {
        return "CERCANIAS_MALAGA";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas M\u00E1laga";
    }

    @Override
    protected String getKernel()
    {
        return "32";
    }

    public MalagaCercaniasTSScrapper()
    {
    }
}
