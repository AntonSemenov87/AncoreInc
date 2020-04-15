package TestNG;

import org.testng.annotations.*;

public class Demo {

    @AfterMethod
    public void demoAfterMethod () {
        System.out.println("@AfterMethod for Demo1 class");
    }

    @Test(groups = "smoke")
    public void firstTC () {
        System.out.println("Demo 1 - first TC");
    }

    @Test
    public void secondTC () {
        System.out.println("Demo 1 - second TC");
    }

    @BeforeTest
    public void zeroTC () {
        System.out.println("@BeforeTest in Demo 1");
    }


    @AfterSuite
    public void goodBye () {
        System.out.println("@AfterSuite in Demo 1");
    }
}
