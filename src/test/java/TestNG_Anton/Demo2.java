package TestNG_Anton;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

    @AfterTest
    public void finalAfter () {
        System.out.println("Demo 2 - @AfterTest");
    }

    @Test
    public void one () {
        System.out.println("Demo 2 - TC 1");
    }

    @Test
    public void two () {
        System.out.println("Demo 2 - TC 2");
    }

    @Test
    public void three () {
        System.out.println("Demo 2 - TC 3");
    }

    @BeforeTest
    public void preRequisite () {
        System.out.println("Demo 2 - @Before Test");
    }


}
