package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.WebDriver;

public class CartLogic implements CartLocators, I_HeaderLogic {

    private WebDriver driver;

    public CartLogic() {

    }

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
