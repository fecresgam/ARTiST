package com.artist;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public enum EMTMadridScrapper
{
    // Singleton instance
    INSTANCE;

    public List<Long> getData()
    {
        List<Long> result = new ArrayList<Long>();

        Document doc = null;

        try
        {
            doc = Jsoup.connect("http://www.emtmadrid.es/Estimaciones/Estimaciones.aspx?data=EKoJHwVMVUkJ%2b%2bnb3MsY0PW%2fyw1wnfdx5b%2bH%2bgIYXWZg7s7PHmwFSL8FXCQWxlPCY1TsRVpDl129gJ4Bf1n3pAWT0LGBEmTZQSRo%2bhQ0chU1ZwXRPvVbnxfHTo8NF0rF%2bNibfKQEHw1QeTVczjJ5qLcHG%2f58WL%2b0kK0KmqPgV6alDTycP3aN8lGsWV84vTG0V15yxHC3CYj3IdNdRadp5uI%3d").get();
            String title = doc.title();
            final Element pnlEstimaciones = doc.getElementById("pnlEstimaciones");

            Elements tables = pnlEstimaciones.getElementsByTag("table");

            if (tables.size() > 0)
            {
                final Element table = tables.get(0);
                final Elements rows = pnlEstimaciones.getElementsByTag("tr");

                for (final Element row : rows)
                {
                    final Elements cells = row.getElementsByTag("td");
                    final Element value = cells.get(2);

                    final String substring = value.text().substring(0, 2);
                    if (!substring.equals(">>") &&
                            !substring.equals("<<") &&
                            !substring.substring(0,1).equals("+"))
                    {
                        result.add(Long.valueOf(substring));
                    }
                    else
                    {
                        result.add(69L);
                    }

                    //TODO fcres: Quitar el break

                }


            }


            //final Integer length = title.length();
          //  result = length.longValue();
        }
        catch (IOException e)
        {

        }

        return result;
    }
}
