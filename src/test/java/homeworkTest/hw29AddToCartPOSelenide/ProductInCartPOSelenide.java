package homeworkTest.hw29AddToCartPOSelenide;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw29POSelenide.object.LaptopSearchPageLogic;
import ua.hillel.homeworks.hw29POSelenide.object.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class ProductInCartPOSelenide {
    @BeforeTest
    public void before() {
        open("https://rozetka.com.ua/");
    }

    @Test
    public void compareTitleAndQuantityOfItem() {

        String titleOfItem = new MainPageLogic()
                .quantityOfItemInCart("0")
                .clickOnCategoryInSideMenu(0)
                .clickOnSubCategory("Ноутбуки")
                .addToCartLaptop(0)
                .isItemInCart()
                .quantityOfItemInHeaderCart("1")
                .getTitleOfProduct(0);

        new LaptopSearchPageLogic()
                .goToTheCartI()
                .checkProductTitleInCart(titleOfItem)
                .checkQuantityOfProductInCart("1");
    }
}
