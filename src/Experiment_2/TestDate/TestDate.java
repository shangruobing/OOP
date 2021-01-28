package Experiment_2.TestDate;

public class TestDate {
    public static void main(String[] args) {
        MyDate myDate=new MyDate();
        myDate.setYear(2013);
        myDate.setMonth(10);
        myDate.setDay(8);
        System.out.println("月份为"+myDate.getMonth()+"月");
        System.out.println(myDate.printDate());

    }
}
