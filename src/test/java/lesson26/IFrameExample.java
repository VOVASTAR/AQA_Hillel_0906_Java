package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class IFrameExample extends InitialDriver {

    @Test
    public void optionExampleTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement frame = driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frame);

        WebElement input = driver.findElement(By.id("tinymce"));
        input.sendKeys("Hi guys!");

        sleep(5000);
    }
}
