package com.artist;

import com.artist.scrapper.EMTMadridScrapper;
import com.artist.vo.ArrivalData;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class EMTMadridScrapperTest
{

    @Test
    public void testRetrieveStopETAList() {
        final EMTMadridScrapper emtMadridScrapper =
                EMTMadridScrapper.INSTANCE;

        List<String> lineList = new ArrayList<String>();
        lineList.add("14");
        lineList.add("27");

        //TODO fcres: Review this code
        final List<ArrivalData> data = emtMadridScrapper.retrieveBeginAndLinesETA("5443", lineList);
        Assert.assertNotNull(data);
    }


    @Test
    public void testRetrieveStopLines() {
        final EMTMadridScrapper emtMadridScrapper =
                EMTMadridScrapper.INSTANCE;

        final List<String> lines = emtMadridScrapper.retrieveStopLines("5443");
        Assert.assertNotNull(lines);
    }



}
