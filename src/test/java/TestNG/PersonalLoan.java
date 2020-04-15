package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoan {

    @Parameters ({"username", "password", "personalURL", "mainURL"})
    @Test
    public void personalLogin (String username, String password, String personalURL, String mainURL) {
        System.out.println("Personal Login at " + personalURL + ", part of " + mainURL);
        System.out.println(username);
        System.out.println(password);
    }

    @Test (dependsOnMethods = "personalLogin")
    public void personalLogout () {
        System.out.println("Personal Logout");
    }


}
