package homeworkTest.hw28TopSales;

import lessonsTests.init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw27Page.object.MainPageLogic;

public class CheckBannerTopSales extends InitialDriver {

    final String EXPECTED_TEXT_TOP_SELLER = "ТОП ПРОДАЖІВ";

    @Test
    public void checkPlawkaTopSales() {

        driver.get("https://rozetka.com.ua/");
        String ActualTextTopSeller = new MainPageLogic(driver)
                .clickOnCategoryLaptopAndComputers()
                .clickOnCategoryLaptop()
                .setCheckbox(webDriverWait, "Продавець", "Rozetka")
                .isFilterSelected(driver, "Rozetka")
                .setFilterMaxPrice(webDriverWait, "Цiна", "100000")
                .isFilterSelected(driver, "- 100000")
                .clickFirstProductWithTopSales(webDriverWait)
                .TextTopSellerOnItemCard();

        Assert.assertEquals(ActualTextTopSeller, EXPECTED_TEXT_TOP_SELLER, "Text on Banner has mistakes");

    }
}
