package SkipassStrat.Days;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by StasMaster on 30.12.17.
 */
public class NighTimeDay implements DayStrategy {
    @Override
    public boolean checkDate(Date date) {
        SimpleDateFormat localDateFormat = new SimpleDateFormat("HH:mm:ss");
        String[] times = localDateFormat.format(new Date()).split(":");
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        if (hour == 16 && minute >= 30) {
            return true;
        }

        if (hour > 16) {
            return true;
        }

        return false;
    }

}
