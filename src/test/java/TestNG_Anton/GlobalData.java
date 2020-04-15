package TestNG_Anton;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

public class GlobalData {

    @Test
    public void login () throws IOException {
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/AntonSemenov/Desktop/AncoreIncFramework/src/test/java/TestNG_Anton/datadriven.properties");

        prop.load(fis);
        System.out.println(prop.getProperty("username"));
        //driver.findElement(By.xpath).sendKeys(username) --> this is hard coded

        WebDriver driver;
        if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new InternetExplorerDriver();
        }

        driver.get(prop.getProperty("url"));
    }



    @Test
    public void test () {
        System.out.println("I'm the test");
    }





}
