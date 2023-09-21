package ua.page.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ua.page.object.HeaderLogic;
import ua.page.object.MainPageLocators;
import ua.page.object.SearchPageLogic;

public class MainPageLogic extends MainPageLocators implements HeaderLogic {

    @FindBy(name = "search")
    private WebElement searchInput;

    @FindBy(xpath = "//button[contains(@class, 'search-form__submit')]")
    private WebElement btnSearch;

    private WebDriver driver;

    public MainPageLogic(WebDriver driver) {
        this.driver = driver;
    }

    public MainPageLogic typeTextToInputSearch(String text) {
        searchInput.sendKeys(text);
        return this;
    }

    public SearchPageLogic clickSearchBtn() {
        btnSearch.click();
        return new SearchPageLogic(driver);
    }

    public MainPageLogic checkingNumberOnCartIcon(String num) {
        iCheckingNumberOnCartIcon(num);
        return this;
    }
}