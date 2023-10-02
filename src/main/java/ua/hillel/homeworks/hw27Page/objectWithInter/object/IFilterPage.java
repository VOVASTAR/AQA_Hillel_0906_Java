package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public interface IFilterPage {

    String checkbox = "//*[contains(text(),'%s')]//ancestor::*[@data-filter-name]//a[@data-id='%s']";
    String chosenFilter = "//rz-selected-filters//a[contains(text(),'%s')]";
    String inputMaxPrice = "//*[contains(text(),'%s')]//ancestor::*[@data-filter-name]//input[2]";

    default <T> T setCheckboxI(WebDriverWait wait, WebDriver driver, String filterName, String filterValue, Class<T> returnType) throws ReflectiveOperationException {
        By checkboxChoose = By.xpath(String.format(checkbox, filterName, filterValue));
        wait.until(ExpectedConditions.elementToBeClickable(checkboxChoose)).click();
        return returnType.getDeclaredConstructor(WebDriver.class).newInstance(driver);
    }

    default <T> T setFilterMaxPriceI(WebDriverWait wait, WebDriver driver, String filterName, String filterValue, Class<T> returnType) throws ReflectiveOperationException {
        By inputMaxPriceLimit = By.xpath(String.format(inputMaxPrice, filterName));
        WebElement filterMaxPrice = wait.until(ExpectedConditions.elementToBeClickable(inputMaxPriceLimit));
        filterMaxPrice.clear();
        filterMaxPrice.sendKeys(filterValue);
        filterMaxPrice.submit();
        return returnType.getDeclaredConstructor(WebDriver.class).newInstance(driver);
    }

    default <T> T isFilterSelectedI(WebDriver driver, String filterValue, Class<T> returnType) throws ReflectiveOperationException {
        By selectedFilter = By.xpath(String.format(chosenFilter, filterValue));
        driver.findElement(selectedFilter).isDisplayed();
        return returnType.getDeclaredConstructor(WebDriver.class).newInstance(driver);
    }
}
