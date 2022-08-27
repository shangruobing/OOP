package test;

import dao.StudentDAO14;
import com.Student14;

import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * @author 冰
 */
public class TestJDBCSave14 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Student14 std1 = new Student14("301010901101", "张三", "男", sdf.parse("2002-01-01"));
        Student14 std2 = new Student14("301010901102", "李四", "女", sdf.parse("2003-01-01"));
        Student14 std3 = new Student14("301010901103", "王五", "男", sdf.parse("2001-01-01"));
        try {
            StudentDAO14.save(std1);
            StudentDAO14.save(std2);
            StudentDAO14.save(std3);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
