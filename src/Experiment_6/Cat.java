package Experiment_6;

public class Cat extends Mammal{
    private String name;
    public Cat() {
        super();
        super.speak="Meow!I am a cat. Meow!Meow!";
    }

    public Cat(String name) {
        super();
        this.name=name;
        super.speak="Meow!I am a cat.My name is "+name+" Meow!Meow!";
    }

    public String getSpeak(){
        return super.speak;
    }
}
