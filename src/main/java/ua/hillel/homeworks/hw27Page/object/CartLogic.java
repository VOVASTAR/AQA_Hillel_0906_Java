package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.WebDriver;

public class CartLogic extends CartLocators {

    private WebDriver driver;

    public CartLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductTitleInCart() {
        return driver.findElement(laptopTitleInCart).getAttribute("innerText");
    }

    public String quantityOfProductInCart() {
        return driver.findElement(counterItemInCart).getAttribute("value");
    }
}
