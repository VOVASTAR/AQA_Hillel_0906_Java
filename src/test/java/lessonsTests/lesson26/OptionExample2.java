package lessonsTests.lesson26;

import lessonsTests.init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OptionExample2 extends InitialDriver {

    @Test
    public void optionExampleTest() throws InterruptedException {
        driver.get("https://www.autodoc.de");

        WebElement cookiesPopup = driver
                .findElement(By.xpath("//*[contains(@class, 'popup-choose-cookies__btn--big')]"));
        cookiesPopup.click();
        selectOption(driver, "2");
//        WebElement selectMark = driver.findElement(By.id("form_maker_id"));
//        WebElement selectMarkValue = driver
//                .findElement(By.xpath("//select[@id='form_maker_id']/optgroup[2]/option[@value=2]"));
//        selectMark.click();
//        selectMarkValue.click();
//        sleep(5000);
    }

    public void selectOption(WebDriver driver, String option) {
        WebElement selectMark = driver.findElement(By.id("form_maker_id"));
        String optionLocator = String.format("//select[@id='form_maker_id']/optgroup[2]/option[@value='%s']", option);
        WebElement selectMarkValue = driver.findElement(By.xpath(optionLocator));
        selectMark.click();
        selectMarkValue.click();
    }
}
