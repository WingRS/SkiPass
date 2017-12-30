package SkipassStrat.Counters;

import Helpers.Day;

import java.util.Date;

/**
 * Created by StasMaster on 18.12.17.
 */
public interface SkiPassStrategy {

    public boolean count(Day day);
    public boolean isValid();
    public int getAvailibleCount();

}
