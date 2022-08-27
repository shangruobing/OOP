package com;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author 冰
 */
@Entity
@Table(name = "contacts")
@TableGenerator(name = "contacts_gen",
        table = "tb_generator",
        pkColumnName = "gen_name",
        valueColumnName = "gen_value",
        pkColumnValue = "CONTACTS_PK",
        allocationSize = 1
)
public class ContactsEO14 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "contacts_gen")
    private Integer id;
    private String information;
    private String type;

    @ManyToOne
    @JoinTable(name = "ref_student_contacts",
            joinColumns = {
                    @JoinColumn(name = "contacts_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            }
    )
    private StudentEO14 student;

    public ContactsEO14() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StudentEO14 getStudent() {
        return student;
    }

    public void setStudent(StudentEO14 student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "id=" + id + ", information=" + information + ", type=" + type;
    }
}
