package SkipassStrat.Days;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by StasMaster on 30.12.17.
 */
public class WorkingDay implements DayStrategy {

    @Override
    public boolean checkDate(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if ((calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
                (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            return false;
        }
        return true;
    }
}
