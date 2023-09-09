package lesson25;

import init.InitialDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeJsExecutor2 extends InitialDriver {
    @Test
    public void jsExecutorScrollTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)", "");
        sleep(5000);
    }
}
