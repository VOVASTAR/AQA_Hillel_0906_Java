package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface I_HeaderLogic {

    By cartBtn = By.xpath("//rz-cart/button");
    By productInCart = By.xpath("//rz-cart//rz-icon-badge");

    default CartLogic goToTheCart(WebDriver driver) {
        driver.findElement(cartBtn).click();
        return new CartLogic(driver);
    }

    default String quantityOfItemInCart(WebDriver driver) {
        return driver.findElement(productInCart).getAttribute("innerText");
    }

}
