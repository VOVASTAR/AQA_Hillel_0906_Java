package ua.hillel.homeworks.hw27Page.objectWithInter.object;

import org.openqa.selenium.WebDriver;

public class MainPageLogic implements MainPageLocators, I_HeaderLogic {

    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public CategoryLaptopAndComputersLogic clickOnCategoryLaptopAndComputers() {
        driver.findElement(sectionLaptopAndComputers).click();
        return new CategoryLaptopAndComputersLogic(driver);
    }
}
