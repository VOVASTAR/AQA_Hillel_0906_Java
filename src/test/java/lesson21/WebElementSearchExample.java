package lesson21;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class WebElementSearchExample {

    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testOnChrome() throws InterruptedException {

        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        WebElement searchBtn = driver.findElement(By.name("btnK"));

        inputSearch.sendKeys("Hillel");
        sleep(5000);
        searchBtn.click();
        sleep(5000);

    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
