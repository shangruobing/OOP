package Experiment_6;

public class TestApp {
    public static void main(String[] args) {
        Mammal[] mammals = new Mammal[4];
          mammals[0] = new Dog();
        mammals[1] = new Cat();
        mammals[2] = new Horse();
        mammals[3] = new Pig();
        for (Mammal mammal : mammals)
            System.out.println(mammal.speak());

        System.out.println();
        mammals[0] = new Dog("Droopy");
        mammals[1] = new Cat("Tom");
        mammals[2] = new Horse("Horsey");
        mammals[3] = new Pig("Piggy");
        for (Mammal mammal : mammals)
            System.out.println(mammal.speak());


    }
}
