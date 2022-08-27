package com;

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
        pkColumnName = "gen_name",
        valueColumnName = "gen_value",
        pkColumnValue = "STUDENT_PK",
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

    @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.EAGER,mappedBy = "student")
    private Collection<ContactsEO14> contacts = new ArrayList<>();

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

    public Collection<ContactsEO14> getContacts() {
        return contacts;
    }

    public void setContacts(Collection<ContactsEO14> contacts) {
        this.contacts = contacts;
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
