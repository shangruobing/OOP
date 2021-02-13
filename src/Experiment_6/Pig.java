package Experiment_6;

public class Pig extends Mammal {
    private String speak;
    private String name;

    public Pig() {
        super();
        name = " ";
        speak = "Oink!";
    }

    public Pig(String name) {
        this.name = name;
        speak = "Oink!";
    }

    public String speak() {
        if (!name.equals(" "))
            return speak + super.speak() + "pig.My name is " + name + "." + speak + speak;
        return speak + super.speak() + "pig." + speak + speak;
    }
}
