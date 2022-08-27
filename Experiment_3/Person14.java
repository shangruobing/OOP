package Experiment_3;

/**
 * @author 冰
 */
public class Person14 {
    private String name;
    private String address;

    public Person14(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public boolean equals(Person14 person) {
        return this.name.equals(person.getName());
    }

    public static void main(String[] args) {
        Person14 person=new Person14("冰","Kunming");
        System.out.println(person.getName());
    }
}
