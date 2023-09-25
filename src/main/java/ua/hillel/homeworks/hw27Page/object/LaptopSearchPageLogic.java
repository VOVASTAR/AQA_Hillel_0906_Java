package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.hillel.homeworks.hw28TopSalesPO.object.IFilterPage;
import ua.hillel.homeworks.hw28TopSalesPO.object.ProductCardPageLogic;

public class LaptopSearchPageLogic extends LaptopSearchPageLocators implements IFilterPage {

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

    public LaptopSearchPageLogic isItemInCart() {
        driver.findElement(stateInCart).isDisplayed();
        return this;
    }

    public LaptopSearchPageLogic setCheckbox(WebDriverWait wait, String filterName, String filterValue) {
        setCheckboxI(wait, filterName, filterValue);
        return this;
    }

    public LaptopSearchPageLogic setFilterMaxPrice(WebDriverWait wait, String filterName, String filterValue) {
        setFilterMaxPriceI(wait, filterName, filterValue);
        return this;
    }

    public LaptopSearchPageLogic isFilterSelected(WebDriver driver, String filterValue) {
        isFilterSelectedI(driver, filterValue);
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
