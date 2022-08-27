package Experiment_5;

import java.sql.Date;

/**
 * @author 冰
 */
public class MainApp14 {
    public MainApp14() {
        Student14[] student;
        Student14 stu1 = new Student14(14, "尚若冰", "男", new Date(2001, 2, 9));
        Student14 stu2 = new Student14(21, "岳姗", "女", new Date(2000, 12, 19));
        Student14 stu3 = new Student14(2, "吴翰芃", "男", new Date(2001, 3, 17));
        Student14 stu4 = new Student14(7, "李亮", "男", new Date(2001, 2, 26));
        Student14 stu5 = new Student14(8, "张三", "女", new Date(2002, 4, 18));
        Student14 stu6 = new Student14(9, "李四", "女", new Date(2003, 12, 19));
        student = new Student14[]{stu1, stu2, stu3, stu4, stu5, stu6};
        Class14 classOne = new Class14(1, "信管191", student);
        System.out.println("班级人数：" + classOne.getCount());
        System.out.printf("班级平均年龄：%.2f\n", classOne.getAvgAge());
        System.out.println("班级男生人数：" + classOne.getMaleNum());
        System.out.println("班级女生人数：" + classOne.getFemaleNum());

        Student14[] student1 = new Student14[]{stu1, stu2, stu3};
        Student14[] student2 = new Student14[]{stu4, stu5, stu6};
        Class14 classTwo = new Class14(2, "国贸191", student1);
        Class14 classThree = new Class14(3, "质量191", student2);
        School14 school = new School14();
        school.setName("昆明理工大学");
        school.setClasses(new Class14[]{classOne, classTwo, classThree});
        System.out.println("学校各班级名单：" + school);
        System.out.println("所有班级的平均人数：" + school.getAvgNum());
    }

    public static void main(String[] args) {
        new MainApp14();
    }
}
