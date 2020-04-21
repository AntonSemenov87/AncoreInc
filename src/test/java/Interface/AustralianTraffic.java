package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

    public void greenGO() {
        System.out.println("Cars can drive");
    }

    public void redStop() {
        System.out.println("Cars should stop");
    }

    public void flashYellow() {
        System.out.println("Cars should wait");
    }

    public void walkSign () {
        System.out.println("Pedestrian can walk");
    }

    public void trainSignal() {

    }


    public static void main(String[] args) {



        AustralianTraffic at = new AustralianTraffic();
        at.greenGO();
        at.flashYellow();
        at.redStop();
        at.trainSignal();

        System.out.println(year);

    }


}
