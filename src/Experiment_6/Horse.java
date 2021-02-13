package Experiment_6;

public class Horse extends Mammal {
    private String speak;
    private String name;

    public Horse() {
        super();
        name = " ";
        speak = "Winnie!";
    }

    public Horse(String name) {
        this.name = name;
        speak = "Winnie!";
    }

    public String speak() {
        if (!name.equals(" "))
            return speak + super.speak() + "horse.My name is " + name + "." + speak + speak;
        return speak + super.speak() + "horse." + speak + speak;
    }
}
