package SkipassStrat.Days;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by StasMaster on 30.12.17.
 */
public class WeekEndDay  implements DayStrategy {
    @Override
    public boolean checkDate(Date date) {
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println( calendar.get(Calendar.DAY_OF_WEEK) );
        if ((calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) ||
                (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
            return true;
        }
        return false;
    }
}
