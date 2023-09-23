package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.WebDriver;

public class LaptopSearchPageLogic extends LaptopSearchPageLocators {

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

}
