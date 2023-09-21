package lesson27;

//        На главной странице в инпут поиск ввести Мас
//        Сохранить тайтл первого товара в поисковой выдаче
//        Перейти на продуктовую страницу первого товара
//        Проверить, что тайтл на поисковой выдаче соответсвует тайтлу на продктовой странице

import init.InitialDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import ua.page.object.MainPageLogic;

public class PageFactoryExample extends InitialDriver {

    @Test
    public void testWithPageObject() {
        driver.get("https://rozetka.com.ua/");
        MainPageLogic mainPageLogic = PageFactory.initElements(driver, MainPageLogic.class);
        mainPageLogic.clickSearchBtn().clickOnFirstProduct();
    }
}