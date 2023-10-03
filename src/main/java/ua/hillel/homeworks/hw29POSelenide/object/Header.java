package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public interface Header {

    SelenideElement cartBtn = $(By.xpath("//rz-cart/button"));
    SelenideElement productInCart = $(By.xpath("//rz-cart//rz-icon-badge/span"));

    default CartLogic goToTheCartI() {
        cartBtn.click();
        return page(CartLogic.class);
    }

    default void quantityOfItemInCartI(String quantityInCart) {
        if(quantityInCart.equals("0")){
            productInCart.shouldNotBe(exist);
        }else {
            productInCart.shouldBe(attribute("innerText",quantityInCart));
        }
    }

}
