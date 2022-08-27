package Bidirectional.test;

import Bidirectional.entity.CourseEO14;
import Bidirectional.entity.StudentEO14;
import Bidirectional.dao.CourseDAO14;
import Bidirectional.dao.StudentDAO14;

import java.util.ArrayList;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) {
        ArrayList<StudentEO14> stuList = new ArrayList<>(StudentDAO14.findAllStudents());
        System.out.print("学生数量：" + stuList.size());
        for (StudentEO14 stu : stuList) {
            System.out.println("\n"+stu.getName()+"所选课程如下：");
            for (CourseEO14 course:stu.getCourses()){
                System.out.print(course.getName()+"  ");
            }
        }
        System.out.println();
        ArrayList<CourseEO14> courseList = new ArrayList<>(CourseDAO14.findAllCourses());
        System.out.print("课程数量：" + courseList.size());
        for (CourseEO14 course : courseList) {
            System.out.println("\n"+course.getName()+"选修学生如下：");
            for (StudentEO14 stu : course.getStudents()) {
                System.out.print(stu.getName()+"  ");
            }
        }
    }
}
