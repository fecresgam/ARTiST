package com.artist;

import com.artist.scrapper.EMTMadridScrapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

public class EMTMadridScrapperTest
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
        final EMTMadridScrapper emtMadridScrapper =
                EMTMadridScrapper.INSTANCE;
        final List<Integer> data = emtMadridScrapper.retrieveLineETA("10", "5442");

//        assertTrue(data > 0);
    }
}
