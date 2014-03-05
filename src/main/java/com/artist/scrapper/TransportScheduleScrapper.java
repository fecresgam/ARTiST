package com.artist.scrapper;

import com.artist.Country;
import com.artist.vo.Stop;

import java.util.List;

public interface TransportScheduleScrapper
{

    public Country getCountryId();
    public Integer getCompanyId();

    public List<Integer> retrieveLineETA(final String lineName, final String stopId);
    public List<Integer> retrieveStopETAList(final String stopId);

    public List<Stop> retrieveAllStops();
}
