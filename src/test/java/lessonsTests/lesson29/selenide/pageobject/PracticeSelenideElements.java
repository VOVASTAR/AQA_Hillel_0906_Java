package lessonsTests.lesson29.selenide.pageobject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.page.object.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class PracticeSelenideElements {

    @BeforeTest
    public void before() {
        open("https://www.rozetka.com.ua/");
    }

    @Test
    public void test() {
        new MainPageLogic().checkCategoryQuantity(17)
                .clickOnCategoryInSideBar(0)
                .clickOnSubCategory("Ноутбуки")
                .checkingQuantityProductOnPage(60);
    }
}