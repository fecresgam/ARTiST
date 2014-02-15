package com.artist;

import java.util.ArrayList;
import java.util.List;

public enum TransportScheduleDAO
{
    // Singleton instance
    INSTANCE;


    public List<Long> findNext()
    {
        List<Long> result = new ArrayList<Long>();
        result.add(3L);
        result.add(7L);

        return result;
    }
}
