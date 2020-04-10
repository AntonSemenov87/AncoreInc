package TestNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {

    @BeforeClass
    public void beforeClass () {
        System.out.println("Demo 3 - @BeforeClass");
    }

    @BeforeSuite
    public void Intro () {
        System.out.println("Demo 3 - @Before Suite");
    }

    @Test(priority = 1)
    public void WebloginCarLoan () {
        // Selenium
        System.out.println("Demo 3 - Weblogincar TC1");
    }

    @Test (priority = 2)
    public void MobileloginCarLoan () {
        // Appium
        System.out.println("Demo 3 -Mobilelogincar TC2");
    }

    @Test (priority = 3)
    public void MobilelogOutCarLoan () {
        // Appium
        System.out.println("Demo 3 - MobilelogOutcar TC3");
    }

    @Test (priority = 4)
    public void MobileSignUpCarLoan () {
        // Appium
        System.out.println("Demo 3 - MobileSignUpcar TC4");
    }

    @Test (priority = 5)
    public void LoginAPICarLoan () {
        // Rest API automation
        System.out.println("Demo 3 - APILogincar TC5");
    }
}
