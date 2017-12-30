package Helpers;

import java.util.Date;


public class Day extends Date {

    private String day;
    private String year;

    public Day() {
        super();
        String[] date = toString().split(" ");
        this.day = date[0] + date[1] + date[2];
        this.year = date[5];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Day day1 = (Day) o;
        if (!day.equals(day1.day)) return false;
        return year.equals(day1.year);
    }


}
