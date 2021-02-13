package Experiment_6;

public class Pig extends Mammal {
    private String name;

    public Pig() {
        super();
        super.speak = "Oink!I am a pig. Oink!Oink!";
    }

    public Pig(String name) {
        super();
        this.name = name;
        super.speak = "Oink!I am a pig.My name is" + name + " Oink!Oink!";
    }

    public String getSpeak() {
        return super.speak;
    }
}
