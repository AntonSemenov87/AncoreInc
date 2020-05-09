package Stuff;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Array;
import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class NeVajno1 {

    @Test
    public void checkNumOfLinks () {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement footer = driver.findElement(By.cssSelector(".navFooterLine.navFooterLinkLine.navFooterDescLine"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        List<WebElement> arr = footer.findElements(By.xpath("//td[@class='navFooterDescItem']"));
        System.out.println(arr.size());

        driver.quit();


    }

}
