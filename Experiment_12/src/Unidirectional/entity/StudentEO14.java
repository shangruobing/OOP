package Unidirectional.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author 冰
 */
@Entity
@Table(name = "student")
@TableGenerator(name = "student_gen",
        table = "tb_generator",
        pkColumnName = "generator_name",
        valueColumnName = "generator_value",
        pkColumnValue = "Student_PK",
        allocationSize = 1
)
public class StudentEO14 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "student_gen")
    private Integer id;
    private String code;
    private String name;
    private String gender;
    private Date birthday;
    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "study",
            joinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id")
            }
    )
    private Collection<CourseEO14> courses = new ArrayList<>();

    public StudentEO14() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Collection<CourseEO14> getCourses() {
        return courses;
    }

    public void setCourses(Collection<CourseEO14> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentEO14{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
