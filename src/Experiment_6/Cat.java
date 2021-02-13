package Experiment_6;

public class Cat extends Mammal {
    private String speak;
    private String name;

    public Cat() {
        super();
        name = " ";
        speak = "Meow!";
    }

    public Cat(String name) {
        this.name = name;
        speak = "Meow!";
    }

    public String speak() {
        if (!name.equals(" "))
            return speak + super.speak() + "cat.My name is " + name + "." + speak + speak;
        return speak + super.speak() + "cat." + speak + speak;
    }
}
