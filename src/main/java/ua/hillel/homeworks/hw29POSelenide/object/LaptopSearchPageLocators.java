package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public interface LaptopSearchPageLocators {

    ElementsCollection laptopOnPage = $$(By.xpath("//span[@class='goods-tile__title']"));
    ElementsCollection buyBtn = $$(By.xpath("//app-buy-button/button"));
    SelenideElement stateInCart = $(By.xpath("//button[contains(@class,'buy-button_state_in-cart')]"));
}
