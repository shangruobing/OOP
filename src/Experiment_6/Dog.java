package Experiment_6;

public class Dog extends Mammal {
    private String speak;
    private String name;

    public Dog() {
        super();
        name = " ";
        speak = "Woof!";
    }

    public Dog(String name) {
        this.name = name;
        speak = "Woof!";
    }

    public String speak() {
        if (!name.equals(" "))
            return speak + super.speak() + "dog.My name is " + name + "." + speak + speak;
        return speak + super.speak() + "dog." + speak + speak;
    }
}
