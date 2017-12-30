package SkipassStrat.Counters;

import Helpers.Day;
import SkipassStrat.Days.DayStrategy;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by StasMaster on 18.12.17.
 */
public class DayCounter implements SkiPassStrategy {


    private int daysAvailible;
    private ArrayList<Day> datesUsed = new ArrayList<Day>();
    private DayStrategy dayStrategy;


    public DayCounter(int days, DayStrategy dayStrategy) {
        this.daysAvailible = days;
        this.dayStrategy = dayStrategy;
    }

    @Override
    public int getAvailibleCount() {
        return daysAvailible;
    }

    public boolean count(Day day) {


        if (datesUsed.contains(day)) {
            return true;
        }
        if (daysAvailible > datesUsed.size() && dayStrategy.checkDate(day)) {
            datesUsed.add(day);
            daysAvailible--;
            return true;
        }
        return false;
    }

    public boolean isValid() {
        return daysAvailible > 0;
    }
}
