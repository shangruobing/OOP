package Bidirectional.test;

import Bidirectional.entity.CourseEO14;
import Bidirectional.dao.CourseDAO14;

/**
 * @author 冰
 */
public class SaveCourse14 {
    public static void main(String[] args) {
        String[][] datas = {{"001", "Java语言程序设计", "48", "5"},
                {"002", "数据结构与算法", "32", "2"}, {"003", "数据库系统原理", "32", "2"},
                {"004", "离散数学", "32", "2"}, {"005", "高级程序设计", "32", "2"}};
        CourseEO14 course;
        for (String[] data : datas) {
            course = new CourseEO14();
            course.setCode(data[0]);
            course.setName(data[1]);
            course.setHour(Integer.parseInt(data[2]));
            course.setScore(Integer.parseInt(data[3]));
            CourseDAO14.save(course);
        }
    }
}
