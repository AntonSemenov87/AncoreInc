package Interface;

import Interface.AnimalActions;

public class Wolf implements AnimalActions {


    public void sound() {
        System.out.println("Wolf has voice");
    }

    public void run() {
        System.out.println("Wolf can run");
    }

    public void swim() {
        System.out.println("Wolf cannot swim");
    }

    public void fly() {
        System.out.println("Wolf cannot fly");
    }

    public void sleep() {
        System.out.println("Wolf can sleep");
    }

    public void eat() {
        System.out.println("Wolf can eat");
    }


}
