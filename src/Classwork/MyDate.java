package Classwork;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String printDate() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

    public static void main(String[] args){
        MyDate myDate=new MyDate();
        myDate.setDay(21);
        myDate.setMonth(4);
        myDate.setYear(1999);
        System.out.println(myDate.printDate());
    }
}
