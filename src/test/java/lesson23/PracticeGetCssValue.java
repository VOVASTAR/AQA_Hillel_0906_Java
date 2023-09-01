package lesson23;

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

public class PracticeGetCssValue {
    final String EXPECTED_BUY_BTN_COLOR = "rgba(0, 160, 70, 1)";
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
        firstProductTitle.click();
        WebElement buyBtn = driver.findElement(By.xpath("//*[@class='product-button__buy ng-star-inserted']//button"));
        String buyBtnColor = buyBtn.getCssValue("background-color");
        System.out.println(buyBtnColor);
        Assert.assertEquals(buyBtnColor, EXPECTED_BUY_BTN_COLOR, "Buy button color are not");

    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
