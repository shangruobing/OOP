package test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 冰
 */
public class TestAge {
    public static int getAge(){
        Date birthday=new Date("Fri Feb 09 00:00:00 CST 2001");
        Calendar calendar = Calendar.getInstance();
        int yearNow = calendar.get(Calendar.YEAR);
        int monthNow = calendar.get(Calendar.MONTH);
        int dayNow = calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(birthday);
        int yearBirth = calendar.get(Calendar.YEAR);
        int monthBirth = calendar.get(Calendar.MONTH);
        int dayBirth = calendar.get(Calendar.DAY_OF_MONTH);

        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayNow < dayBirth) {
                    age--;
                }
            } else {
                age--;
            }
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(getAge());
    }
}
