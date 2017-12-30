package entity;

import SkipassStrat.Counters.CycleCounter;
import SkipassStrat.Counters.DayCounter;
import SkipassStrat.Counters.UnlimitedCounter;
import SkipassStrat.Days.EarlySeasonDay;
import SkipassStrat.Days.WeekEndDay;
import SkipassStrat.Days.WorkingDay;

import java.util.ArrayList;


public class SkiPassFactory {

    private ArrayList<SkiPass> skiPasses = new ArrayList<>();


    public  SkiPass getWeekendSkiPass(int days, Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new DayCounter(days, new WeekEndDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public  SkiPass getWorkingDaySkiPass(int days, Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new DayCounter(days, new WorkingDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public  SkiPass getEarlySeasonSkiPass(Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new UnlimitedCounter(new EarlySeasonDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public  SkiPass getEarlySeasonCyclesSkiPass(int cycles, Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new CycleCounter(cycles, new EarlySeasonDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public  SkiPass getWorkingDayCyclesSkiPass(int cycles, Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new CycleCounter(cycles, new WorkingDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public  SkiPass getWeekandDayCyclesSkiPass(int cycles, Customer customer) {
        SkiPass skiPass = new SkiPass(customer, new CycleCounter(cycles, new WeekEndDay()));
        skiPasses.add(skiPass);
        return skiPass;
    }

    public SkiPassFactory() {

    }

    public boolean banSkiPass(SkiPass skiPass) {
        if(skiPasses.contains(skiPass)) {
            skiPass.block();
            return true;
        }
        return false;
    }

    public boolean banSkiPass(int id) {
        for (SkiPass skiPassSearch:
             skiPasses) {
            if (skiPassSearch.getId() == id) {
                skiPassSearch.block();
                return true;
            }
        }
        return false;
    }


}
