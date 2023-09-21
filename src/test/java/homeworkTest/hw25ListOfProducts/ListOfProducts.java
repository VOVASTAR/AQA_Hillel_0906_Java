package homeworkTest.hw25ListOfProducts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListOfProducts {
    WebDriver driver;

    @BeforeTest
    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
    }

    @Test
    public void compareTitleAndQuantity() throws IOException {

        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        WebElement sectionLaptopAndComputers = driver
                .findElement(By.xpath("//rz-main-page-sidebar//a[contains(@href,'computers-notebooks')]"));
        sectionLaptopAndComputers.click();

        WebElement sectionLaptops = driver
                .findElement(By.xpath("//rz-list-tile//a[contains(@href,'notebooks')]"));
        sectionLaptops.click();

        List<WebElement> laptopsTitle = driver.findElements(By.xpath("//a[contains(@class,'goods-tile__heading')]"));
        List<WebElement> laptopsPrice = driver.findElements(By.xpath("//span[@class='goods-tile__price-value']"));

        Map<String, String> listOfLaptop = new LinkedHashMap<>();
        if (laptopsTitle.size() == 60 && laptopsPrice.size() == 60) {
            for (int i = 0; i < laptopsTitle.size(); i++) {
                String laptopTitleText = laptopsTitle.get(i).getAttribute("title");
                String laptopPriceValue = laptopsPrice.get(i).getAttribute("innerText");
                listOfLaptop.put(laptopTitleText, laptopPriceValue);
            }
        } else {
            Assert.fail("Quantity of items not equals 60");
        }

        try (FileWriter fileWriter = new FileWriter("rozetkaTest.txt")) {
            for (Map.Entry<String, String> product : listOfLaptop.entrySet()) {
                String cleanedText = product.getValue().replaceAll("[^0-9]", " ");
                fileWriter.write(product.getKey() + " - " + cleanedText + "\n");
            }
        }
    }

    @AfterTest
    public void driverQuit() {
        driver.quit();
    }
}
