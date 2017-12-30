import Helpers.DateHelper;
import Helpers.Day;
import SkipassStrat.Days.EarlySeasonDay;
import SkipassStrat.Days.NighTimeDay;
import SkipassStrat.Days.WeekEndDay;
import SkipassStrat.Days.WorkingDay;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by StasMaster on 30.12.17.
 */
public class DayHelperTest {

    @Test
    public void testWeekDay() {
        assertTrue(new WeekEndDay().checkDate(new Date()));
    }

    @Test
    public void testWorkDay() {
        assertFalse(new WorkingDay().checkDate(new Date()));
    }

    @Test
    public void testSeasonDay() {
        assertTrue(new EarlySeasonDay().checkDate(new Date()));
    }

    @Test
    public void testNightDay() {
        assertTrue(new NighTimeDay().checkDate(new Date()));
    }


    @Test
    public void testDay() {
        assertTrue(new Day().equals(new Day()));
    }
}
