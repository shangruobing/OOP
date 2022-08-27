package test;

import com.JdbcUtils14;
import com.Student14;
import dao.StudentDAO14;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) throws SQLException {
        System.out.println("统计结果如下：");
        JdbcUtils14.getNumberOfMenAndWomen();
        // JdbcUtils14.getAverageAge();
        ArrayList<Student14> list = new ArrayList<>(StudentDAO14.findAllStudent());
        double avgAge = 0;
        for (Student14 stu : list) {
            avgAge += stu.getAge();
        }
        System.out.println("平均年龄为：" + avgAge / list.size());
    }
}
