package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.WebDriver;

public class CategoryLaptopAndComputersLogic extends CategoryLaptopAndComputersLocators {

    private WebDriver driver;

    public CategoryLaptopAndComputersLogic(WebDriver driver) {
        this.driver = driver;
    }

    public LaptopSearchPageLogic clickOnCategoryLaptop() {
        driver.findElement(sectionLaptop).click();
        return new LaptopSearchPageLogic(driver);
    }
}
