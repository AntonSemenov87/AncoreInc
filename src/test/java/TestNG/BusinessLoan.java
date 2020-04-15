package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BusinessLoan {

    @Parameters ({"username", "password", "businessURL", "mainURL"})
    @Test
    public void businessLogin (String username, String password, String businessURL, String mainURL) {
        System.out.println("Business login at " + businessURL + ", part of " + mainURL);
        System.out.println(username);
        System.out.println(password);
    }

    @Test (dependsOnMethods = "businessLogin")
    public void businessLogout () {
        System.out.println("Business logout");
    }



}
