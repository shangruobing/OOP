package Experiment_5;

import java.util.Arrays;

/**
 * @author 冰
 */
public class School14 {
    private String name;
    private Class14[] classes;

    public School14() {
    }

    public School14(String name, Class14[] classes) {
        this.name = name;
        this.classes = classes;
    }

    public double getAvgNum() {
        double count = 0;
        for (int i = 0; i < getCount(); i++) {
            count += classes[i].getCount();
        }
        return count / getCount();
    }

    public int getCount() {
        int count = 0;
        for (Class14 aClass : classes) {
            if (aClass != null) {
                count++;
            }
        }
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(Class14[] classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", classes=" + Arrays.toString(classes) +
                '}';
    }
}
