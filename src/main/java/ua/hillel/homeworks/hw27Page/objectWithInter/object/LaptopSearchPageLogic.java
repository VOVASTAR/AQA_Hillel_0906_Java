package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaptopSearchPageLogic implements LaptopSearchPageLocators, IFilterPage {

    private WebDriver driver;

    public LaptopSearchPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitleOfProduct() {
        return driver.findElement(firstLaptopTitle).getAttribute("innerText");
    }

    public LaptopSearchPageLogic addToCartFirstLaptop() {
        driver.findElement(buyBtn).click();
        return this;
    }

    public LaptopSearchPageLogic itemInCart() {
        driver.findElement(stateInCart).isDisplayed();
        return this;
    }

    public ProductCardPageLogic clickFirstProductWithTopSales(WebDriverWait wait) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});"
                , driver.findElement(firstLaptopWithTopSales));
        wait.until(ExpectedConditions.elementToBeClickable(firstLaptopWithTopSales)).click();
        return new ProductCardPageLogic(driver);
    }
}
