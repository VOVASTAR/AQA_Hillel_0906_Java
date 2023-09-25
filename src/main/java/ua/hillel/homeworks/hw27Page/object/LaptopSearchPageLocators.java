package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.By;

public class LaptopSearchPageLocators {

    By firstLaptopTitle = By.xpath("//span[@class='goods-tile__title']");
    By buyBtn = By.xpath("//app-buy-button/button");
    By stateInCart = By.xpath("//button[contains(@class,'buy-button_state_in-cart')]");
    By firstLaptopWithTopSales = By.xpath("//span[contains(@class,'promo-label_type_popularity')]/following-sibling::a");

}
