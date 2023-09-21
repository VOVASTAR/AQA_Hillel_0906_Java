package lessonsTests.lesson19.chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeTestWithDriver {

    WebDriver driver;

    @BeforeClass
    public void init() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    @BeforeTest
    public void SetupDriver() {
        driver = new ChromeDriver();
    }

    @Test
    public void testOnChrome() {
        driver.get("https://www.selenium.dev/");
    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
