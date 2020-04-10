package TestNG;

import org.testng.annotations.Test;

public class Demo3 {

    @Test(priority = 1)
    public void WebloginCarLoan () {
        // Selenium
        System.out.println("Demo 3 -Weblogincar");
    }

    @Test (priority = 2)
    public void MobileloginCarLoan () {
        // Appium
        System.out.println("Demo 3 -Mobilelogincar");
    }

    @Test (priority = 3)
    public void MobilelogOutCarLoan () {
        // Appium
        System.out.println("Demo 3 - MobilelogOutcar");
    }

    @Test (priority = 4)
    public void MobileSignUpCarLoan () {
        // Appium
        System.out.println("Demo 3 - MobileSignUpcar");
    }

    @Test (priority = 5)
    public void LoginAPICarLoan () {
        // Rest API automation
        System.out.println("Demo 3 - APILogincar");
    }
}
