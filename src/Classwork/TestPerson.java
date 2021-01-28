package Classwork;

public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(19);
        person.setGender("男");
        person.setName("尚若冰");
        System.out.println(person.getInfo());
        System.out.println(person.sayHello());
    }
}
