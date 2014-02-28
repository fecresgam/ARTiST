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
        return EMTMadridScrapper.INSTANCE.retrieveLineETA(lineId, stopId);

    }
         /*

    public Long getRandomTime()
    {
        final Double timeD = Math.random() * 10;



        return timeD.longValue();
    }  */
}
