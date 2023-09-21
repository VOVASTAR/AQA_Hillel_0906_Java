package homeworkTest.hw24AddToCart;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductInCart {

    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    }

    @Test
    public void compareTitleAndQuantity() {

        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement sectionLaptopAndComputers = driver
                .findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href,'computers-notebooks')]"));
        sectionLaptopAndComputers.click();

        WebElement sectionLaptops = driver
                .findElement(By.xpath("//rz-list-tile//a[contains(@href,'notebooks')]"));
        sectionLaptops.click();

        WebElement firstLaptop = driver.findElement(By.xpath("//rz-catalog-tile"));
        firstLaptop.click();

        WebElement laptopTitle = driver.findElement(By.xpath("//rz-title-block//h1"));
        String titleText = laptopTitle.getAttribute("innerText");

        WebElement productInCart = driver.findElement(By.xpath("//rz-cart//rz-icon-badge"));
        String productInCartQuantity = productInCart.getAttribute("innerText");
        Assert.assertEquals(productInCartQuantity, "", "Cart doesn`t empty");

        WebElement buyBtn = driver.findElement(By.xpath("//rz-product-buy-btn//button"));
        buyBtn.click();

        WebElement closeCartPopup = driver.findElement(By.xpath("//button[@class='modal__close']"));
        closeCartPopup.click();

        WebElement stateInCart = driver.findElement(By.xpath("//button[contains(@class,'buy-button_state_in-cart')]"));
        Assert.assertTrue(stateInCart.isDisplayed(), "Item not in the cart");
        productInCartQuantity = productInCart.getText().trim();

        WebElement cartBtn = driver.findElement(By.xpath("//rz-cart/button"));
        cartBtn.click();

        WebElement laptopTitleInCart = driver.findElement(By.xpath("//a[@class='cart-product__title']"));
        String laptopTitleTextInCart = laptopTitleInCart.getAttribute("innerText");

        WebElement counterItemInCart = driver.findElement(By.xpath("//rz-cart-counter//input"));
        String quantityItemInCart = counterItemInCart.getAttribute("value");

        Assert.assertEquals(laptopTitleTextInCart, titleText, "Titles doesn't equals");
        Assert.assertEquals(quantityItemInCart, productInCartQuantity, "Quantity doesn`t equals");
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
