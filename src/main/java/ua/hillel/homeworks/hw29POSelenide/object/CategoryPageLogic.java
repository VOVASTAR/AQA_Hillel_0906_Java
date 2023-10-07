package ua.hillel.homeworks.hw29POSelenide.object;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.page;

public class CategoryPageLogic implements CategoryPageLocators {

    public LaptopSearchPageLogic clickOnSubCategory(String subCategoryName) {

        subCategories.last().shouldBe(visible);

        for (SelenideElement subCategory : subCategories) {
            if (subCategory.text().equals(subCategoryName)) {
                subCategory.click();
                break;
            }
        }
        return page(LaptopSearchPageLogic.class);
    }
}
