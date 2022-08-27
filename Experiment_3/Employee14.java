package Experiment_3;

import java.sql.Date;

/**
 * @author 冰
 */
public abstract class Employee14 {
    private String id;
    private String name;
    private Date birthday;
    private String mobileTel;
    private static final String NEW_LINE = System.getProperty("line.separator");
    //系统的换行符

    public Employee14(String id, String name, Date birthday, String mobileTel) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.mobileTel = mobileTel;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getMobileTel() {
        return mobileTel;
    }

    @Override
    public String toString() {
        return "id=" + id + NEW_LINE +
                "name=" + name + NEW_LINE +
                "birthday=" + birthday + NEW_LINE +
                "mobileTel=" + mobileTel + NEW_LINE;
    }

    public static void main(String[] args) {
        Employee14 employee14 = new Employee14("14", "尚若冰",
                new Date(101, 1, 9), "0376") {
        };
        System.out.println(employee14);
    }
}
