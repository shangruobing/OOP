package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 冰
 */
public class TestDate {
    public static void main(String[] args) throws ParseException {
        Date utilDate =new Date();
        System.out.println(utilDate);

        java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
        System.out.println(sqlDate);

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(utilDate));

        String dateString=("2000-11-05");
        System.out.println((sdf.parse(dateString)));
    }
}
