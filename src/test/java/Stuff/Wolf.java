package Stuff;

public class Wolf implements AnimalActions{


    public void sound() {
        System.out.println("This animal has voice");
    }

    public void run() {
        System.out.println("This animal can run");
    }

    public void swim() {
        System.out.println("This animal can swim");
    }

    public void fly() {
        System.out.println("This animal can fly");
    }

    public void sleep() {
        System.out.println("This animal can sleep");
    }

    public void eat() {
        System.out.println("This animal can eat");
    }

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.eat();
        wolf.run();
        wolf.sleep();
        wolf.sound();
    }
}
