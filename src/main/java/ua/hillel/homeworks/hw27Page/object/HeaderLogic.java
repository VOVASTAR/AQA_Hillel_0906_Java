package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.WebDriver;

public class HeaderLogic extends HeaderLocators {

    private WebDriver driver;

    public HeaderLogic(WebDriver driver) {
        this.driver = driver;
    }

    public CartLogic goToTheCart() {
        driver.findElement(cartBtn).click();
        return new CartLogic(driver);
    }

    public String quantityOfItemInCart() {
        return driver.findElement(productInCart).getAttribute("innerText");
    }

}
