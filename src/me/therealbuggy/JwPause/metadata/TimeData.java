package me.therealbuggy.JwPause.metadata;

/**
 * Created by jonathan on 28/12/15.
 */
public class TimeData {
    private final boolean storm;
    private final boolean thunder;
    private final int thunderTime;
    private final int weatherTime;
    private final long time;

    public TimeData(boolean storm, boolean thunder, int thunderTime, int weatherTime, long time) {
        this.storm = storm;
        this.thunder = thunder;
        this.thunderTime = thunderTime;
        this.weatherTime = weatherTime;
        this.time = time;
    }

    public boolean hasStorm() {
        return storm;
    }

    public boolean isThundering() {
        return thunder;
    }

    public int getThunderTime() {
        return thunderTime;
    }

    public int getWeatherTime() {
        return weatherTime;
    }

    public long getTime() {
        return time;
    }
}
