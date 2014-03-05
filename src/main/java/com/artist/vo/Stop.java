package com.artist.vo;

public class Stop
{
    private String id;
    private String label;

    public Stop(final String id, final String label)
    {
        this.id = id;
        this.label = label;
    }

    public String getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }
}
