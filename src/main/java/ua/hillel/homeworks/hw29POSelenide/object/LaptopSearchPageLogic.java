package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.Condition;

public class LaptopSearchPageLogic implements LaptopSearchPageLocators, Header {

    public String getTitleOfProduct(int position) {
        return laptopOnPage.get(position).text();
    }

    public LaptopSearchPageLogic addToCartLaptop(int position) {
        buyBtn.get(position).click();
        return this;
    }

    public LaptopSearchPageLogic isItemInCart() {
        stateInCart.shouldBe(Condition.visible);
        return this;
    }

    public LaptopSearchPageLogic quantityOfItemInHeaderCart(String quantityInCart) {
        quantityOfItemInCartI(quantityInCart);
        return this;
    }

}
