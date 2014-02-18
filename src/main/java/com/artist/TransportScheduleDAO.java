package com.artist;

import java.util.List;

public enum TransportScheduleDAO
{
    // Singleton instance
    INSTANCE;


    public List<Long> findNext()
    {

        return EMTMadridScrapper.INSTANCE.getData();
    }


    public Long getRandomTime()
    {
        final Double timeD = Math.random() * 10;



        return timeD.longValue();
    }
}
