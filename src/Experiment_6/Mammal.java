package Experiment_6;

public class Mammal{
    protected int age;
    protected int weight;
    protected String speak;

    public Mammal() {
        age=2;
        weight=5;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String speak() {
        return "I am a ";
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }
}
