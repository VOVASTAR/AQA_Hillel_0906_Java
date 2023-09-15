package ua.hillel.homeworks.hw26PromotionCarusel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CheckPromotionCarousel {

    WebDriver driver;
    String mainPageUrl = "https://rozetka.com.ua/ua/";

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.manage().window().maximize();
    }

    @Test
    public void checkPromotionCarousel() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(mainPageUrl);

        WebElement carouselTitle = driver.findElement(By.xpath("//h2[starts-with(text(),' Акц')]"));
        String carouselTitleText = carouselTitle.getAttribute("textContent");

        List<WebElement> carouselItems = driver
                .findElements(By.xpath(String.format("//h2[text()='%s']/..//li", carouselTitleText)));
        int actualSizeCarousel = carouselItems.size();
        Assert.assertEquals(actualSizeCarousel, 6, "There are not 6 items are displayed in the carousel");

        WebElement firstProductInCarousel = carouselItems.get(0);

        WebElement firstProductPrice = firstProductInCarousel
                .findElement(By.xpath(".//div[contains(@class,'tile__price ')]"));
        String firstProductPriceValue = firstProductPrice.getAttribute("innerText");

        firstProductInCarousel.click();
        WebElement priceInBigProductCard = driver.findElement(By.xpath("//p[contains(@class,'product-price__big')]"));
        String priceInBigProductCardValue = priceInBigProductCard.getAttribute("innerText");
        Assert.assertEquals(firstProductPriceValue, priceInBigProductCardValue, "Price doesn`t equals");

        WebElement logo = driver.findElement(By.xpath("//a[@class='header__logo']"));
        logo.click();
        String urlAfterReferenceByLogo = driver.getCurrentUrl();
        Assert.assertEquals(urlAfterReferenceByLogo, mainPageUrl, "Urls don`t equals");

        while (true) {
            try {
                driver.findElement(By.xpath(String.format("//h2[text()='%s']", carouselTitleText)));
                break;
            } catch (NoSuchElementException elementException) {
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            }
        }

        carouselItems = driver
                .findElements(By.xpath(String.format("//h2[text()='%s']/..//li", carouselTitleText)));
        actualSizeCarousel = carouselItems.size();
        Assert.assertEquals(actualSizeCarousel, 6, "There are not 6 items are displayed in the carousel");
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }


}
