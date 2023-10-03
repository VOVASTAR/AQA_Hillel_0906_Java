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
                .getProductTitleInCart(titleOfItem)
                .quantityOfProductInCart("1");

//
//        HeaderLogic headerCart = new HeaderLogic(driver);
//        String quantityOfProductOnCartIcon = headerCart.quantityOfItemInCart();
//        Assert.assertEquals(quantityOfProductOnCartIcon, "", "Cart doesn`t empty");
//
//        String titleTextFirstLaptop = new MainPageLogic(driver)
//                .clickOnCategoryLaptopAndComputers()
//                .clickOnCategoryLaptop()
//                .addToCartFirstLaptop()
//                .isItemInCart()
//                .getTitleOfProduct();
//
//        quantityOfProductOnCartIcon = headerCart.quantityOfItemInCart();
//
//        CartLogic cart = headerCart.goToTheCart();
//        String titleTextFirstLaptopInCart = cart.getProductTitleInCart();
//        String quantityOfProductInCart = cart.quantityOfProductInCart();
//
//        Assert.assertEquals(titleTextFirstLaptop, titleTextFirstLaptopInCart, "Titles doesn't equals");
//        Assert.assertEquals(quantityOfProductOnCartIcon, quantityOfProductInCart, "Cart doesn`t empty");
    }
}
