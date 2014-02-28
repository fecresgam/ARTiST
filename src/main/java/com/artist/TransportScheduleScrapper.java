package com.artist;

import java.util.List;

public interface TransportScheduleScrapper
{

    public Country getCountryId();
    public Integer getCompanyId();

    public List<Integer> retrieveLineETA(final String lineName, final String stopId);
    public List<Integer> retrieveStopETAList(final String stopId);
}
