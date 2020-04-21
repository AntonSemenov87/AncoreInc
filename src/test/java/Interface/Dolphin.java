package Interface;

import Interface.AnimalActions;

public class Dolphin implements AnimalActions {


    public void sound() {
        System.out.println("Dolphin can do sound");
    }

    public void run() {
        System.out.println("Dolphin cannot run");
    }

    public void swim() {
        System.out.println("Dolphin can swim");
    }

    public void fly() {
        System.out.println("Dolphin cannot fly");
    }

    public void sleep() {
        System.out.println("Dolphin can sleep");
    }

    public void eat() {
        System.out.println("Dolphin can swim");
    }
}
