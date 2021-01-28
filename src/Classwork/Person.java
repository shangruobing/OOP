package Classwork;

public class Person {
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public Person(String name,int age,String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }
    public Person(){

    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getInfo() {
        return "姓名为: " + name + " 年龄为: " + age + " 性别为: " + gender;
    }

    public String sayHello() {
        return "Hello everybody";
    }
}
