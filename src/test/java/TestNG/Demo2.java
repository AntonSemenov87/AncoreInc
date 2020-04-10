package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {

    @AfterTest
    public void finalAfter () {
        System.out.println("This is what's done after all tests of Demo 2");
    }

    @Test
    public void one () {
        System.out.println("Demo 2 - one");
    }

    @Test
    public void two () {
        System.out.println("Demo 2 - two");
    }

    @Test
    public void three () {
        System.out.println("Demo 2 - three");
    }

    @BeforeTest
    public void preRequisite () {
        System.out.println("This is pre-requisite");
    }


}
