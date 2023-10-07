package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public interface CartLocators {

    SelenideElement laptopTitleInCart = $(By.xpath("//a[@class='cart-product__title']"));
    SelenideElement counterItemInCart = $(By.xpath("//rz-cart-counter//input"));

}
