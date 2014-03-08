package com.artist.scrapper.cercanias;

public class ZaragozaCercaniasTSScrapper extends AbstractCercaniasScrapper
{
    @Override
    public String getServiceId()
    {
        return "CERCANIAS_ZARAGOZA";
    }

    @Override
    public String getServiceLabel()
    {
        return "Cercan\u00EDas Zaragoza";
    }

    @Override
    protected String getKernel()
    {
        return "70";
    }

    public ZaragozaCercaniasTSScrapper()
    {
    }
}
