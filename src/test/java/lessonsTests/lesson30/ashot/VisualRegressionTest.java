package lessonsTests.lesson30.ashot;

import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class VisualRegressionTest {

    @Test
    public void screenShon() throws IOException {
        open("https://www.google.com.ua/");
        Screenshot screenshots = new AShot().takeScreenshot(getWebDriver());
        ImageIO.write(screenshots.getImage(), "PNG", new File("screen/screen.png"));
    }
}
