package Experiment_6;

public class Dog extends Mammal{
  //  private String name;
    public Dog() {
        super();
        super.speak="Woof!I am a dog. Woof!Woof!";
    }

    public Dog(String name) {
        super();
    //    this.name = name;
        super.speak="Woof!I am a dog.My name is "+name+" woof!Woof!";
    }

    public String getSpeak(){
        return super.speak;
    }
}
