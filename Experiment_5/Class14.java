package Experiment_5;

import java.util.Arrays;

/**
 * @author 冰
 */
public class Class14 {
    private int id;
    private String name;
    private Student14[] student;

    public Class14() {
    }

    public Class14(int id, String name, Student14[] student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public int getCount() {
        int count = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null) {
                count++;
            }
        }
        return count;
    }

    public int getMaleNum() {
        int maleNum = 0;
        for (int i = 0; i < getCount(); i++) {
            if ("男".equals(student[i].getSex())) {
                maleNum++;
            }
        }
        return maleNum;
    }

    public int getFemaleNum() {
        int femaleNum = 0;
        for (int i = 0; i < getCount(); i++) {
            if ("女".equals(student[i].getSex())) {
                femaleNum++;
            }
        }
        return femaleNum;
    }

    public double getAvgAge() {
        double avgAge = 0;
        for (int i = 0; i < getCount(); i++) {
            avgAge += student[i].getAge();
        }
        return avgAge / getCount();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student14[] getStudent() {
        return student;
    }

    public void setStudent(Student14[] student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", student=" + Arrays.toString(student) +
                '}';
    }
}
