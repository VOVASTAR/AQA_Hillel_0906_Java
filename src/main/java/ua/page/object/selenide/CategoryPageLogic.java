package ua.page.object.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic extends CategoryPageLocators {

    public SearchPageLogic clickOnSubCategory(String categoryName) {
        subCategories.last().shouldBe(Condition.visible);

        for (SelenideElement e : subCategories) {
            if (e.text().equals(categoryName)) {
                e.click();
                break;
            }
        }
        return page(SearchPageLogic.class);
    }

    public SearchPageLogic clickOnSubCategory2(String categoryName) {
        subCategoriesMethod(categoryName).click();
        return page(SearchPageLogic.class);
    }

}