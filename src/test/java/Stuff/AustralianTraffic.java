package Stuff;

public class AustralianTraffic implements CentralTraffic {

    public void greenGO() {
        System.out.println("Cars can drive");
    }

    public void redStop() {
        System.out.println("Cars should stop");
    }

    public void flashYellow() {
        System.out.println("Cars should wait");
    }

    public static void main(String[] args) {

        AustralianTraffic at = new AustralianTraffic();
        at.greenGO();
        at.flashYellow();
        at.redStop();

    }

}
