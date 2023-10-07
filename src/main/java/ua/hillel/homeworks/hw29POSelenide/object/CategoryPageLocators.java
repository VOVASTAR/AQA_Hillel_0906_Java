package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface CategoryPageLocators {

    ElementsCollection subCategories = $$(By.xpath("//a[contains(@class, 'tile-cats__heading')]"));

}
