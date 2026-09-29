class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Rabbit extends Animal {
    void run() {
        System.out.println("Rabbit runs");
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println("Dog:");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        System.out.println("Rabbit:");
        rabbit.eat();
        rabbit.sleep();
        rabbit.run();
    }
}
