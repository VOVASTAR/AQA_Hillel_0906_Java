package ua.hillel.homeworks.hw28TopSalesPO.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface IFilterPage {

    String checkbox = "//*[contains(text(),'%s')]//ancestor::*[@data-filter-name]//a[@data-id='%s']";
    String chosenFilter = "//rz-selected-filters//a[contains(text(),'%s')]";
    String inputMaxPrice = "//*[contains(text(),'%s')]//ancestor::*[@data-filter-name]//input[2]";

    default IFilterPage setCheckboxI(WebDriverWait wait, String filterName, String filterValue) {
        By checkboxChoose = By.xpath(String.format(checkbox, filterName, filterValue));
        wait.until(ExpectedConditions.elementToBeClickable(checkboxChoose)).click();
        return this;
    }

    default IFilterPage setFilterMaxPriceI(WebDriverWait wait, String filterName, String filterValue) {
        By inputMaxPriceLimit = By.xpath(String.format(inputMaxPrice, filterName));
        WebElement filterMaxPrice = wait.until(ExpectedConditions.elementToBeClickable(inputMaxPriceLimit));
        filterMaxPrice.clear();
        filterMaxPrice.sendKeys(filterValue);
        filterMaxPrice.submit();
        return this;
    }

    default IFilterPage isFilterSelectedI(WebDriver driver, String filterValue) {
        By selectedFilter = By.xpath(String.format(chosenFilter, filterValue));
        driver.findElement(selectedFilter).isDisplayed();
        return this;
    }
}
