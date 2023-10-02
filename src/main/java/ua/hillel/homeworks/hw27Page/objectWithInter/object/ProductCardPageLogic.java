package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.WebDriver;

public class ProductCardPageLogic implements ProductCardPageLocators {

    private WebDriver driver;

    public ProductCardPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String TextTopSellerOnItemCard() {
        return driver.findElement(textTopSellerOnProduct).getText().trim();
    }
}
