package Interface;

import Interface.Dolphin;
import Interface.Wolf;

public class Zoo {
    public static void main(String[] args) {
        Dolphin dolphin = new Dolphin();
        dolphin.eat();
        dolphin.swim();

        Wolf wolf = new Wolf();
        wolf.run();
        wolf.eat();
    }
}
