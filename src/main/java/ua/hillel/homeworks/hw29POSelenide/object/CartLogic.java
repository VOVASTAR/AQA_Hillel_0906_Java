package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.Condition;

public class CartLogic implements CartLocators {

    public CartLogic checkProductTitleInCart(String titleOFItem) {
        laptopTitleInCart.shouldHave(Condition.attribute("innerText", titleOFItem));
        return this;
    }

    public CartLogic checkQuantityOfProductInCart(String quantity) {
        counterItemInCart.shouldHave(Condition.attribute("value", quantity));
        return this;
    }
}
