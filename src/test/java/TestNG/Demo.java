package TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void firstTC () {
        System.out.println("first TC");
    }

    @Test
    public void secondTC () {
        System.out.println("second TC");
    }

    @BeforeTest
    public void zeroTC () {
        System.out.println("This TC is before class Demo (first TC, second TC) and Demo 4");
    }


}
