package lessonsTests.lesson25;

import lessonsTests.init.InitialDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeJsExecutor3 extends InitialDriver {
    @Test
    public void jsExecutorAlertTest() throws InterruptedException {
        driver.get("https://rozetka.com.ua/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Are you sure');");
        sleep(5000);
        sleep(5000);

        driver.switchTo().alert().accept();
        sleep(5000);


    }
}
