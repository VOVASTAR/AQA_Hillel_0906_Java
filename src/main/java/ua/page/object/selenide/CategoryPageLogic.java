package ua.page.object.selenide;

import com.codeborne.selenide.SelenideElement;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageLocators {

    public SearchPageLogic clickOnSubCategory(String categoryName) {
        SelenideElement element = null;
        for (SelenideElement e : subCategories) {
            if (e.text().equals(categoryName)) {
                element = e;
                break;
            }
        }
        Objects.requireNonNull(element).click();
        return page(SearchPageLogic.class);
    }

    public SearchPageLogic clickOnSubCategory2(String categoryName) {
        subCategoriesMethod(categoryName).click();
        return page(SearchPageLogic.class);
    }

}