package com.artist;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class TransportScheduleDAOTest
{

    @BeforeClass
    public static void testSetup()
    {
        //TODO fcres: Review this code
    }

    @AfterClass
    public static void testCleanup()
    {
        // Teardown for data used by the unit tests
        //TODO fcres: Review this code

    }

    @Test
    public void testSearch() {
        final TransportScheduleDAO transportScheduleDAO =
                TransportScheduleDAO.INSTANCE;
        final List<Integer> list = transportScheduleDAO.findNext(Country.SPAIN, 1, "10", "5442");

      /*  assertNotNull(list);
        assertTrue(list.size() > 0);    */
    }
}
