package ua.hillel.homeworks.hw29POSelenide.object;

import static com.codeborne.selenide.Selenide.page;

public class MainPageLogic implements MainPageLocators, Header {

    public CategoryPageLogic clickOnCategoryInSideMenu(int category) {
        sideBarCategoryMenu.get(category).click();
        return page(CategoryPageLogic.class);
    }

    public MainPageLogic quantityOfItemInCart(String quantityInCart) {
        quantityOfItemInCartI(quantityInCart);
        return this;
    }
}
