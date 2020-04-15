package TestNG_Anton;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalData {

    @Test
    public void login () throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/AntonSemenov/Desktop/AncoreIncFramework/src/test/java/TestNG_Anton/datadriven.properties");

        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        //driver.findElement(By.xpath).sendKeys(username) --> this is hard coded
    }



    @Test
    public void test () {
        System.out.println("I'm the test");
    }





}
