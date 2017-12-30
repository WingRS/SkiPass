package SkipassStrat.Counters;

import Helpers.Day;
import SkipassStrat.Days.DayStrategy;

import java.util.Date;

/**
 * Created by StasMaster on 30.12.17.
 */
public class UnlimitedCounter implements SkiPassStrategy {

    private DayStrategy dayStrategy;

    public UnlimitedCounter(DayStrategy dayStrategy) {
        this.dayStrategy = dayStrategy;
    }


    @Override
    public boolean count(Day day) {
        if (dayStrategy.checkDate(day)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValid() {
        return true;
    }

    @Override
    public int getAvailibleCount() {
        return Integer.MAX_VALUE;
    }
}
