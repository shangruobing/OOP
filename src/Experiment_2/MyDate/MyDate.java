package Experiment_2.MyDate;

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
        if ((1 <= getMonth() && getMonth() <= 9) && (1 <= getDay() && getDay() <= 9))
            return getYear() + "-0" + getMonth() + "-0" + getDay();

        if (1 <= getMonth() && getMonth() <= 9)
            return getYear() + "-0" + getMonth() + "-" + getDay();

        if (1 <= getDay() && getDay() <= 9)
            return getYear() + "-" + getMonth() + "-0" + getDay();

        return getYear() + "-" + getMonth() + "-" + getDay();
    }

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.setDay(9);
        myDate.setMonth(2);
        myDate.setYear(2021);
        System.out.println(myDate.printDate());
    }
}
