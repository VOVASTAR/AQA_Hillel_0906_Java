package lessonsTests.lesson28;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @BeforeMethod
    public void before() {
        Configuration.timeout = 10000;
        open("https://www.google.com.ua/");
    }

    @Test
    public void selenideFirstTest() {
        $(By.name("q")).setValue("Hillel").pressEnter();
        sleep(3000);
    }

    @Test
    public void selenideSecondTest() {
        $(By.xpath("//div[@class='FPdoLc lJ9FBc']//*[@name='btnK']"))
                .shouldBe(Condition.visible)
                .shouldHave(Condition.value("Поиск в Google"), Duration.ofSeconds(5000))
                .shouldHave(Condition.exactValue("Поиск в Google"))
                .shouldNotHave(Condition.value("Alex"))
                .click();

    }
}
