package homeworkTest.hw27AddToCartPageObject;

import lessonsTests.init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw27Page.objectWithInter.object.CartLogic;
import ua.hillel.homeworks.hw27Page.objectWithInter.object.MainPageLogic;


public class ProductInCartPO_I extends InitialDriver {

    @Test
    public void compareTitleAndQuantity() {
        driver.get("https://rozetka.com.ua/");

        MainPageLogic mainPageLogic = new MainPageLogic(driver);
        String quantityOfProductOnCartIcon = mainPageLogic
                .quantityOfItemInCart(driver);
        Assert.assertEquals(quantityOfProductOnCartIcon, "", "Cart doesn`t empty");

        String titleTextFirstLaptop = mainPageLogic
                .clickOnCategoryLaptopAndComputers()
                .clickOnCategoryLaptop()
                .addToCartFirstLaptop()
                .itemInCart()
                .getTitleOfProduct();

        quantityOfProductOnCartIcon = mainPageLogic.quantityOfItemInCart(driver);

        mainPageLogic.goToTheCart(driver);

        CartLogic cart = new CartLogic(driver);
        String titleTextFirstLaptopInCart = cart.getProductTitleInCart();
        String quantityOfProductInCart = cart.quantityOfProductInCart();

        Assert.assertEquals(titleTextFirstLaptop, titleTextFirstLaptopInCart, "Titles doesn't equals");
        Assert.assertEquals(quantityOfProductOnCartIcon, quantityOfProductInCart, "Cart doesn`t empty");
    }
}
