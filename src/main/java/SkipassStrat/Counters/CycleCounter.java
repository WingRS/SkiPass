package SkipassStrat.Counters;

import Helpers.Day;
import SkipassStrat.Days.DayStrategy;

import java.util.Date;

/**
 * Created by StasMaster on 20.12.17.
 */
public class CycleCounter implements SkiPassStrategy {

    private int cycles;
    private DayStrategy dayStrategy;

    public CycleCounter(int cycles, DayStrategy dayStrategy) {
        this.cycles = cycles;
        this.dayStrategy = dayStrategy;
    }


    public boolean count(Day day) {
        if (dayStrategy.checkDate(day) && isValid()) {
            cycles--;
            return true;
        }
        return false;
    }


    public boolean isValid() {
        return cycles > 0;
    }

    @Override
    public int getAvailibleCount() {
        return cycles;
    }
}
