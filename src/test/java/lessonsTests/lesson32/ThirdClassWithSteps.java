package lessonsTests.lesson32;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ua.page.object.selenide.MainPageLogic;

import static com.codeborne.selenide.Selenide.open;

public class ThirdClassWithSteps {

    @BeforeTest
    public void before() {
        open("https://www.rozetka.com.ua/");
    }

    @Test
    public void test() {
        new MainPageLogic().checkCategoryQuantity(17)
                .clickOnCategoryInSideBar(0)
                .clickOnSubCategory2("Ноутбуки")
                .checkingQuantityProductOnPage(60);
    }
}
