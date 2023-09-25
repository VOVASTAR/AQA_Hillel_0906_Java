package ua.hillel.homeworks.hw27Page.object;

import org.openqa.selenium.WebDriver;

public class MainPageLogic extends MainPageLocators {

    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public CategoryLaptopAndComputersLogic clickOnCategoryLaptopAndComputers() {
        driver.findElement(sectionLaptopAndComputers).click();
        return new CategoryLaptopAndComputersLogic(driver);
    }
}
