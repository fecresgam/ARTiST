package com.artist;

public enum Country
{
    GERMANY (276, "Germany"),
    SPAIN (724, "Spain");

    /* The ISO 3166 country code number */
    private Integer code;
    private String name;

    Country(final Integer code, final String name)
    {
        this.code = code;
        this.name = name;
    }

    public Integer getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }
}
