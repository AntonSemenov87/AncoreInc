package TestNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo4 {

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("Demo 4 - @BeforeMethod");
    }

    @Test
    public void WebloginHomeLoan () {
        // Selenium
        System.out.println("Demo 4 - WebloginHome TC1");
    }

    @Test
    public void MobileloginHomeLoan () {
        // Appium
        System.out.println("Demo 4 - MobileloginHome TC2");
    }

    @Test
    public void LoginAPIHomeLoan () {
        // Rest API automation
        System.out.println("Demo 4 - APILoginHome TC3");
    }

    @Test
    public void LogOutAPIHomeLoan () {
        System.out.println("Demo 4 - APILogOutHome TC4");
    }
}
