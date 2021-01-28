package Experiment_2.TestDate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year != 0)
            this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (1 <= month && month <= 12)
            this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (1 <= day && day <= 31)
            this.day = day;
    }

    public String printDate() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }
}
