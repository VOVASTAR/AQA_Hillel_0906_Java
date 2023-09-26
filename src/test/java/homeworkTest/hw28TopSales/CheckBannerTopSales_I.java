package homeworkTest.hw28TopSales;

import lessonsTests.init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.homeworks.hw27Page.objectWithInter.object.LaptopSearchPageLogic;
import ua.hillel.homeworks.hw27Page.objectWithInter.object.MainPageLogic;

public class CheckBannerTopSales_I extends InitialDriver {

    final String EXPECTED_TEXT_TOP_SELLER = "ТОП ПРОДАЖІВ";

    @Test
    public void checkPlawkaTopSales() throws ReflectiveOperationException {
        driver.get("https://rozetka.com.ua/");

        String ActualTextTopSeller = new MainPageLogic(driver)
                .clickOnCategoryLaptopAndComputers()
                .clickOnCategoryLaptop()
                .setCheckboxI(webDriverWait, driver, "Продавець", "Rozetka", LaptopSearchPageLogic.class)
                .isFilterSelectedI(driver, "Rozetka", LaptopSearchPageLogic.class)
                .setFilterMaxPriceI(webDriverWait, driver, "Цiна", "100000", LaptopSearchPageLogic.class)
                .isFilterSelectedI(driver, "- 100000", LaptopSearchPageLogic.class)
                .clickFirstProductWithTopSales(webDriverWait)
                .TextTopSellerOnItemCard();

        Assert.assertEquals(ActualTextTopSeller, EXPECTED_TEXT_TOP_SELLER, "Text on Banner has mistakes");

    }
}
