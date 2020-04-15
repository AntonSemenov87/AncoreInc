package TestNG_Anton;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {

    @Parameters ({"URL"})
    @Test (timeOut = 10000)
    public void Login (String URL) {
        System.out.println("I'm signing in");
        System.out.println(URL);
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
