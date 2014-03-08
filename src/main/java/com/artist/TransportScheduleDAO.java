package com.artist;

import java.util.List;

public enum TransportScheduleDAO
{
    // Singleton instance
    INSTANCE;


    public List<Integer> findNext(final Country country,
                                  final Integer companyId,
                                  final String lineId,
                                  final String stopId)
    {



        //todo fcres: add factory
        //return EMTMadridScrapper.INSTANCE.retrieveBeginAndLinesETA(lineId, stopId);
        return null;

    }
         /*

    public Long getRandomTime()
    {
        final Double timeD = Math.random() * 10;



        return timeD.longValue();
    }  */
}
