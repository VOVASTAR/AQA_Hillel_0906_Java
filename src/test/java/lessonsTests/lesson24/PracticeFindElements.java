package lessonsTests.lesson24;

import lessonsTests.init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeFindElements extends InitialDriver {

    @Test
    public void findElement() {
        driver.get("https://rozetka.com.ua/");
        WebElement laptopsAndComp = driver
                .findElement(By.xpath("//ul[contains(@class,'menu-categories_type_main')]/li[1]"));
        laptopsAndComp.click();
        WebElement laptops = driver.findElement(By.xpath("//a[@title='Ноутбуки'][1]"));
        laptops.click();

        List<WebElement> productsFromSearch = driver
                .findElements(By.xpath("//div[@class='goods-tile__inner']"));

//        for (WebElement e : productsFromSearch) {
//            System.out.println(e.getAttribute("innerText"));
//        }

        int countProduct = productsFromSearch.size();
        Assert.assertEquals(countProduct, 60);


    }

}
