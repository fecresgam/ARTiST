package com.artist;

public class ArrivalData
{
    private String lineId;
    private String stopId;
    private String destinationName;
    private Integer secondsLeft;
    private boolean toLessTime;
    private boolean toMuchTime;

    public ArrivalData(
            final String lineId,
            final String stopId,
            final String destinationName,
            final Integer secondsLeft,
            final boolean toLessTime,
            final boolean toMuchTime)
    {
        this.lineId = lineId;
        this.stopId = stopId;
        this.destinationName = destinationName;
        this.secondsLeft = secondsLeft;
        this.toLessTime = toLessTime;
        this.toMuchTime = toMuchTime;
    }

    public String getLineId()
    {
        return lineId;
    }

    public String getStopId()
    {
        return stopId;
    }

    public String getDestinationName()
    {
        return destinationName;
    }

    public Integer getSecondsLeft()
    {
        return secondsLeft;
    }

    public boolean isToLessTime()
    {
        return toLessTime;
    }

    public boolean isToMuchTime()
    {
        return toMuchTime;
    }
}
