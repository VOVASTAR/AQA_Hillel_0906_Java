package homeworkTest.hw27AddToCartPageObject;

import lessonsTests.init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw27Page.object.CartLogic;
import ua.hillel.homeworks.hw27Page.object.HeaderLogic;
import ua.hillel.homeworks.hw27Page.object.MainPageLogic;

public class ProductInCartPO extends InitialDriver {

    @Test
    public void compareTitleAndQuantityOfItem() {
        driver.get("https://rozetka.com.ua/");

        HeaderLogic headerCart = new HeaderLogic(driver);
        String quantityOfProductOnCartIcon = headerCart.quantityOfItemInCart();
        Assert.assertEquals(quantityOfProductOnCartIcon, "", "Cart doesn`t empty");

        String titleTextFirstLaptop = new MainPageLogic(driver)
                .clickOnCategoryLaptopAndComputers()
                .clickOnCategoryLaptop()
                .addToCartFirstLaptop()
                .isItemInCart()
                .getTitleOfProduct();

        quantityOfProductOnCartIcon = headerCart.quantityOfItemInCart();

        CartLogic cart = headerCart.goToTheCart();
        String titleTextFirstLaptopInCart = cart.getProductTitleInCart();
        String quantityOfProductInCart = cart.quantityOfProductInCart();

        Assert.assertEquals(titleTextFirstLaptop, titleTextFirstLaptopInCart, "Titles doesn't equals");
        Assert.assertEquals(quantityOfProductOnCartIcon, quantityOfProductInCart, "Cart doesn`t empty");
    }
}
