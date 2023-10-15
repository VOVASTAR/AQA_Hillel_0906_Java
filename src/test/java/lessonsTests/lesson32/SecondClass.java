package lessonsTests.lesson32;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import ua.page.object.selenide.MainPageLogic;

public class SecondClass {

    @Test()
    @Flaky()
    @Owner("Alex")
    @Lead("Oleg")
    @Description("Test check something")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Checking availability")
    @Feature("Check In - Check Out")
    @Story("User should choose Flexible Dates")
    @Issue("WW-1")
    @TmsLink("tc-1")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void test() {
        new MainPageLogic().checkCategoryQuantity(17)
                .clickOnCategoryInSideBar(0)
                .clickOnSubCategory2("Ноутбуки")
                .checkingQuantityProductOnPage(60);
    }
}
