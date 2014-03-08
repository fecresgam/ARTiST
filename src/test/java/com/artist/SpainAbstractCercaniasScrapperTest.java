package com.artist;

import com.artist.scrapper.cercanias.AsturiasCercaniasTSScrapper;
import com.artist.scrapper.cercanias.BarcelonaCercaniasTSScrapper;
import com.artist.scrapper.cercanias.BilbaoCercaniasTSScrapper;
import com.artist.scrapper.cercanias.CadizCercaniasTSScrapper;
import com.artist.scrapper.cercanias.MadridCercaniasTSScrapper;
import com.artist.scrapper.cercanias.MalagaCercaniasTSScrapper;
import com.artist.scrapper.cercanias.MurciaAlicanteCercaniasTSScrapper;
import com.artist.scrapper.cercanias.SanSebastianCercaniasTSScrapper;
import com.artist.scrapper.cercanias.SantanderCercaniasTSScrapper;
import com.artist.scrapper.cercanias.SevillaCercaniasTSScrapper;
import com.artist.scrapper.cercanias.ValenciaCercaniasTSScrapper;
import com.artist.scrapper.cercanias.ZaragozaCercaniasTSScrapper;
import com.artist.vo.ArrivalData;
import com.artist.vo.Stop;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SpainAbstractCercaniasScrapperTest
{
    @Test
    public void testRetrieveBeginToEndETA() {
        final MadridCercaniasTSScrapper scrapper =
                new MadridCercaniasTSScrapper();

        final List<ArrivalData> etas = scrapper.retrieveBeginToEndETA("18000", "35600");

        Assert.assertNotNull(etas);
        Assert.assertTrue(etas.size() > 0);
    }

    @Test
    public void testRetrieveAllStopsAsturias() {
        final AsturiasCercaniasTSScrapper scrapper =
                new AsturiasCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Aviles"));
        Assert.assertTrue(existsStopByName(stops, "Oviedo"));
    }

    @Test
    public void testRetrieveAllStopsBarcelona() {
        final BarcelonaCercaniasTSScrapper scrapper =
                new BarcelonaCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Badalona"));
        Assert.assertTrue(existsStopByName(stops, "Blanes"));
    }

    @Test
    public void testRetrieveAllStopsBilbao() {
        final BilbaoCercaniasTSScrapper scrapper =
                new BilbaoCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Muskiz"));
        Assert.assertTrue(existsStopByName(stops, "Sestao"));
    }

    @Test
    public void testRetrieveAllStopsCadiz() {
        final CadizCercaniasTSScrapper scrapper =
                new CadizCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Cadiz"));
        Assert.assertTrue(existsStopByName(stops, "Puerto Real"));
    }

    @Test
    public void testRetrieveAllStopsMadrid() {
        final MadridCercaniasTSScrapper scrapper =
                new MadridCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Atocha"));
        Assert.assertTrue(existsStopByName(stops, "Sol"));
    }

    @Test
    public void testRetrieveAllStopsMalaga() {
        final MalagaCercaniasTSScrapper scrapper =
                new MalagaCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Fuengirola"));
        Assert.assertTrue(existsStopByName(stops, "Torremolinos"));
    }

    @Test
    public void testRetrieveAllStopsMurciaAlicante() {
        final MurciaAlicanteCercaniasTSScrapper scrapper =
                new MurciaAlicanteCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Crevillente"));
        Assert.assertTrue(existsStopByName(stops, "Almendricos"));
    }

    @Test
    public void testRetrieveAllStopsSantander() {
        final SantanderCercaniasTSScrapper scrapper =
                new SantanderCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Boo"));
        Assert.assertTrue(existsStopByName(stops, "Torrelavega"));
    }

    @Test
    public void testRetrieveAllStopsSanSebastian() {
        final SanSebastianCercaniasTSScrapper scrapper =
                new SanSebastianCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Irun"));
        Assert.assertTrue(existsStopByName(stops, "Tolosa"));
    }

    @Test
    public void testRetrieveAllStopsSevilla() {
        final SevillaCercaniasTSScrapper scrapper =
                new SevillaCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Dos Hermanas"));
        Assert.assertTrue(existsStopByName(stops, "Utrera"));
    }

    @Test
    public void testRetrieveAllStopsValencia() {
        final ValenciaCercaniasTSScrapper scrapper =
                new ValenciaCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Gandia"));
        Assert.assertTrue(existsStopByName(stops, "Requena"));
    }

    @Test
    public void testRetrieveAllStopsZaragoza() {
        final ZaragozaCercaniasTSScrapper scrapper =
                new ZaragozaCercaniasTSScrapper();

        final List<Stop> stops = scrapper.retrieveAllStops();

        Assert.assertNotNull(stops);
        Assert.assertTrue(stops.size() > 0);
        Assert.assertTrue(existsStopByName(stops, "Miraflores"));
        Assert.assertTrue(existsStopByName(stops, "Utebo"));
    }


    /**
     * Return true if the stop list contains a certain stop
     *
     * @param stops the stop list.
     * @param stopLabel the stop to search.
     * @return such information.
     */
    private boolean existsStopByName(final List<Stop> stops, final String stopLabel)
    {
        for (final Stop stop : stops)
        {
            if (stopLabel.equals(stop.getLabel()))
            {
                return true;
            }
        }
        return false;
    }


}
