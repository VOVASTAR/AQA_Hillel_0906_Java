package lessonsTests.lesson26;

import lessonsTests.init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class KeysExample extends InitialDriver {

    @Test
    public void KeysExample() throws InterruptedException {
        driver.get("https://www.google.com.ua/");
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys((Keys.chord(Keys.SHIFT, "Hello")));
        input.sendKeys(Keys.ENTER);
        sleep(5000);
    }
}
