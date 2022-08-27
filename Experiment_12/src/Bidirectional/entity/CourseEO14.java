package Bidirectional.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 冰
 */
@Entity(name = "course14")
@Table(name = "course")
@TableGenerator(name = "course_gen",
        table = "tb_generator",
        pkColumnName = "generator_name",
        valueColumnName = "generator_value",
        pkColumnValue = "Course_PK",
        allocationSize = 1)
public class CourseEO14 {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "course_gen")
    private Integer id;
    private String code;
    private String name;
    private Integer hour;
    private Integer score;
    @ManyToMany(mappedBy = "courses",cascade = {CascadeType.ALL},fetch = FetchType.EAGER)
    private Collection<StudentEO14> students=new ArrayList<>();

    public CourseEO14() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Collection<StudentEO14> getStudents() {
        return students;
    }

    public void setStudents(Collection<StudentEO14> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CourseEO14{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", hour=" + hour +
                ", score=" + score +
                '}';
    }
}
