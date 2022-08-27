package Unidirectional.test;

import Unidirectional.entity.StudentEO14;
import Unidirectional.dao.StudentDAO14;

import java.util.ArrayList;

/**
 * @author 冰
 */
public class TestApp14 {
    public static void main(String[] args) {
        ArrayList<StudentEO14> list = new ArrayList<>(StudentDAO14.findAllStudents());
        System.out.println("学生数量：" + list.size());
        for (StudentEO14 stu : list) {
            System.out.println(stu.getName() + stu.getCourses());
        }
    }
}
