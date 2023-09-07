package ua.hillel.homeworks.hw23TopSales;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class CheckTopSales {

    final String EXPECTED_TEXT_TOP_SELLER = "ТОП ПРОДАЖІВ";

    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofMillis(5000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void checkPlawkaTopSales() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement sectionLaptopAndComputers = driver
                .findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href,'computers-notebooks')]"));
        sectionLaptopAndComputers.click();
        WebElement sectionLaptops = driver
                .findElement(By.xpath("//a[@class='tile-cats__picture' and contains(@href,'notebooks')]"));
        sectionLaptops.click();
        WebElement checkBoxSellerRozetka = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@data-id='Rozetka']")));
        checkBoxSellerRozetka.click();
        WebElement filterUpperPrice = webDriverWait
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//fieldset//input[@formcontrolname='max']")));
        filterUpperPrice.clear();
        filterUpperPrice.sendKeys("100000");
        WebElement submitFilterBtn = driver.findElement(By.xpath("//fieldset//button"));
        submitFilterBtn.click();
        WebElement firstLaptopWithTopSales = driver.findElement
                (By.xpath("//span[contains(@class,'promo-label_type_popularity')]/following-sibling::a"));
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", firstLaptopWithTopSales);
        firstLaptopWithTopSales.click();
        WebElement textTopSellerOnProduct = driver.findElement
                (By.xpath("//span[contains(@class,'promo-label_type_popularity')]"));
        String ActualTextTopSeller = textTopSellerOnProduct.getText().trim();
        Assert.assertEquals(ActualTextTopSeller, EXPECTED_TEXT_TOP_SELLER, "Текст не совпадает");
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
