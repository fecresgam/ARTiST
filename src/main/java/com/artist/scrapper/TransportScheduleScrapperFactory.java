package com.artist.scrapper;

import com.artist.Country;
import com.artist.scrapper.TransportScheduleScrapper;

import java.util.ResourceBundle;

public enum TransportScheduleScrapperFactory
{
    INSTANCE;

    public TransportScheduleScrapper getTransportScheduleScrapper(final Country country,
                                                                  final Integer companyId)
    {

        final String className = getClassName(country, companyId);
        return createInstance(className);
    }



    public final String getClassName(
            final Country country,
            final Integer companyId)
    {

        return
                getClassName(
                        "keyprefixapelo" + companyId,
                        "propertiesapelo" + country.getCode()
                );
    }


    protected final String getClassName(
            final String key,
            final String bundleName)
    {
        return
                getClassName(
                        key,
                        ResourceBundle.getBundle(bundleName)
                );
    }


    protected final String getClassName(
            final String key,
            final ResourceBundle bundle)
    {
        return bundle.getString(key);
    }

    @SuppressWarnings("unchecked")
    protected <T> T createInstance(final String className)
    {
        T result = null;

        try
        {
            Class managerClass = Class.forName(className);

            result = (T) managerClass.newInstance();
        }
        catch (final IllegalAccessException iae)
        {
            //TODO fcres: Review this code
           /*
            LogFactory.getLog(AbstractDateFactory.class).error(
                    "error instantiating manager", iae);
        */
        }
        catch (final ClassNotFoundException cnfe)
        {
            //TODO fcres: Review this code
           /*
            LogFactory.getLog(AbstractDateFactory.class).error(
                    "error instantiating manager",cnfe);
        */
        }
        catch (final InstantiationException ie)
        {
            //TODO fcres: Review this code
           /*
            LogFactory.getLog(AbstractDateFactory.class).error(
                    "error instantiating manager",ie);
         */
        }

        return result;
    }


}
