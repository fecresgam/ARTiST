package com.artist.scrapper;

import com.artist.Country;
import com.artist.vo.ArrivalData;
import com.artist.vo.Stop;

import java.util.List;

public interface TransportScheduleScrapper
{
    enum ScrapperType {START_AND_LINE, START_AND_END}

    public ScrapperType getScrapperType();
    public Country getCountryId();
    public String getServiceId();
    public String getServiceLabel();

    public List<Stop> retrieveAllStops();
    public List<String> retrieveStopLines(final String stopId);

    public List<ArrivalData> retrieveBeginToEndETA(final String beginStopId, final String endStopId);
    public List<ArrivalData> retrieveBeginAndLinesETA(final String stopId, final List<String> lineName);
}
