package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.By;

public interface CartLocators {

    By laptopTitleInCart = By.xpath("//a[@class='cart-product__title']");
    By counterItemInCart = By.xpath("//rz-cart-counter//input");
}
