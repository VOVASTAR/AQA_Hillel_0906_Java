package ua.page.object;

import org.openqa.selenium.By;

public class MainPageLocators {

    By searchInput = By.name("search");
    By btnSearch = By.xpath("//button[contains(@class, 'search-form__submit')]");

}
