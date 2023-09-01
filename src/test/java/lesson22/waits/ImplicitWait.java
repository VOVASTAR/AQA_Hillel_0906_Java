package lesson22.waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class ImplicitWait {

    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void testImplicitExample() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement laptops = driver.findElement(
                By.xpath("//a[@class='menu-categories__link' and starts-with(text(), 'Ноут')]"));
        laptops.click();
        sleep(5000);
    }

}