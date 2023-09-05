package lesson24;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeSubmit extends InitialDriver {

    final String EXPECTED_BTN_SEARCH_TEXT = "Поиск в Google";

    @Test
    public void submitTest() {

        driver.get("https://www.google.com.ua/");
        WebElement inputSearch = driver.findElement(By.name("q"));
        inputSearch.sendKeys("QA");
        WebElement btnSearch = driver.findElement(By.name("btnK"));
        String btnSearchText = btnSearch.getAttribute("value");
        if (btnSearchText.equals(EXPECTED_BTN_SEARCH_TEXT)) {
            btnSearch.submit();
        } else {
            Assert.fail();
        }
    }
}
