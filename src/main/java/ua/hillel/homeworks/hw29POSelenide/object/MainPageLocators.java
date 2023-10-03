package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface MainPageLocators {

    ElementsCollection sideBarCategoryMenu = $$(By.xpath("//ul[contains(@class,'menu-categories_type_main')]/li"));
}
