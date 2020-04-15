package TestNG;

import org.testng.annotations.Test;

public class Demo5 {

    @Test (timeOut = 10000)
    public void Login () {
        System.out.println("I'm signing in");
    }

    @Test (dependsOnMethods = "Login")
    public void addPicture () {
        System.out.println("I'm adding a picture");
    }

    @Test (enabled = false)
    public void sendMessage () {
        System.out.println("I'm sending a message and I have a bug");
    }
}
