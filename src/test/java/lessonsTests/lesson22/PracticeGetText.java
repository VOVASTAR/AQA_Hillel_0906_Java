package lessonsTests.lesson22;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class PracticeGetText {

    final String EXPECTED_TITLE = "Ноутбук Apple MacBook Air 13 M1 8/256GB 2020 (MGN63) Space Gray";
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void assertTest() {
        driver.get("https://rozetka.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.sendKeys("Mac");
        WebElement searchBnt = driver.findElement(By.xpath("//button[contains(@class, 'search-form__submit')]"));
        searchBnt.click();
        WebElement firstProductTitle = driver.findElement(By.xpath("//span[@class='goods-tile__title']"));
        String firstProductTitleText = firstProductTitle.getText().trim();

//        if (!firstProductTitleText.contains("MacBook")) {
//            Assert.fail("Title doesn't contains expected Data");
//        } else {
//            System.out.println("All OK!");
//        }

        Assert.assertEquals(firstProductTitleText, EXPECTED_TITLE, "Title doesn't contains expected Data");
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}


