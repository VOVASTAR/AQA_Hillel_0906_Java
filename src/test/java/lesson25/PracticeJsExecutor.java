package lesson25;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeJsExecutor extends InitialDriver {
    @Test
    public void jsExecutorClickTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("search"));
        inputSearch.sendKeys("Mac");
        WebElement searchBnt = driver.findElement(By.xpath("//button[contains(@class, 'search-form__submit')]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click;", searchBnt);
        sleep(5000);
    }
}
