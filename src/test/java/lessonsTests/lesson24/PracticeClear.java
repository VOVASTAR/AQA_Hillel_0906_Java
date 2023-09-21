package lessonsTests.lesson24;

import lessonsTests.init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class PracticeClear extends InitialDriver {


    @Test
    public void submitTest() throws InterruptedException {

        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        inputSearch.sendKeys("QA");
        sleep(5000);
        inputSearch.clear();
        sleep(5000);
    }
}
