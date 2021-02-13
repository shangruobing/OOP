package Experiment_6;

public class Horse extends Mammal{
    private String name;
    public Horse() {
        super();
        super.speak="Winnie!I am a horse. Winnie!Winnie!";
    }

    public Horse(String name) {
        super();
        this.name = name;
        super.speak="Winnie!I am a horse.My name is "+name+" Winnie!Winnie!";
    }

    public String getSpeak(){
        return super.speak;
    }
}
