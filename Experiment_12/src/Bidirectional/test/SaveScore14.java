package Bidirectional.test;

import Bidirectional.entity.CourseEO14;
import Bidirectional.entity.ScoreEO14;
import Bidirectional.entity.StudentEO14;
import Bidirectional.dao.CourseDAO14;
import Bidirectional.dao.ScoreDAO14;

import java.util.ArrayList;
/**
 * @author 冰
 */
public class SaveScore14 {
    public static void main(String[] args) {
        ArrayList<CourseEO14> courseList = new ArrayList<>(CourseDAO14.findAllCourses());
        ScoreEO14 score;
        for (CourseEO14 course : courseList) {
            score = new ScoreEO14();
            score.setC_code(course.getCode());
            score.setC_name(course.getName());
            for (StudentEO14 stu : course.getStudents()) {
                score.setId(null);
                score.setS_code(stu.getCode());
                score.setS_name(stu.getName());
                int number = (int) (Math.random() * 40 + 60);
                score.setScore(number);
                ScoreDAO14.save(score);
            }
        }
    }
}
