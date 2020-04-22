package Inheritance;

public class ChildClassDemo extends ParentClassDemo {

    public static void main(String[] args) {
        ChildClassDemo cd = new ChildClassDemo();
        cd.audioSystem();
        cd.brakes();
        cd.engine();


    }

    public void engine () {
        System.out.println("new engine");
    }


}
