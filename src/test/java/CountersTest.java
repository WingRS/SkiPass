import Helpers.Day;
import SkipassStrat.Counters.CycleCounter;
import SkipassStrat.Counters.DayCounter;
import SkipassStrat.Days.EarlySeasonDay;
import SkipassStrat.Days.NighTimeDay;
import SkipassStrat.Days.WeekEndDay;
import SkipassStrat.Days.WorkingDay;
import SkipassStrat.Counters.SkiPassStrategy;
import org.junit.Test;



import static org.junit.Assert.*;


public class CountersTest {


    @Test
    public void testCycles() {
        SkiPassStrategy counter = new CycleCounter(20, new NighTimeDay());
        assertTrue(counter.count(new Day()));
        counter.count(new Day());
        assertEquals(18, counter.getAvailibleCount());

        counter = new CycleCounter(20, new WorkingDay());
        assertFalse(counter.count(new Day()));
        assertTrue(20 == counter.getAvailibleCount());

        counter = new CycleCounter(20, new EarlySeasonDay());
        assertTrue(counter.count(new Day()));
        assertEquals(19, counter.getAvailibleCount());

        counter = new CycleCounter(20, new WeekEndDay());
        assertTrue(counter.count(new Day()));

        counter = new CycleCounter(1, new WeekEndDay());
        assertTrue(counter.count(new Day()));
        assertFalse(counter.count(new Day()));
    }

    @Test
    public void testDays() {
        SkiPassStrategy counter = new DayCounter(4, new WorkingDay());
        assertFalse(counter.count(new Day()));
        assertTrue(4 == counter.getAvailibleCount());

        counter = new DayCounter(4, new WeekEndDay());
        assertTrue(counter.count(new Day()));
        assertTrue(counter.getAvailibleCount() == 3);

        counter = new DayCounter(4, new NighTimeDay());
        assertTrue(counter.count(new Day()));
        assertTrue(counter.getAvailibleCount() == 3);

        counter = new DayCounter(4, new EarlySeasonDay());
        assertTrue(counter.count(new Day()));
        assertTrue(counter.getAvailibleCount() == 3);
    }

}
