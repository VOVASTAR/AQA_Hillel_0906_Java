package ua.hillel.homeworks.hw28TopSalesPO.object;

import org.openqa.selenium.WebDriver;

public class ProductCardPageLogic extends ProductCardPageLocators {

    private WebDriver driver;

    public ProductCardPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public String TextTopSellerOnItemCard() {
        return driver.findElement(textTopSellerOnProduct).getText().trim();
    }
}
