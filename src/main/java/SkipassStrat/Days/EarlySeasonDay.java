package SkipassStrat.Days;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by StasMaster on 30.12.17.
 */
public class EarlySeasonDay implements DayStrategy {

    @Override
    public boolean checkDate(Date date) {
        Calendar calendar = Calendar.getInstance();

        calendar.setTime(date);

        if (calendar.get(Calendar.MONTH) == Calendar.DECEMBER) {
            return true;
        }

        return false;
    }
}
