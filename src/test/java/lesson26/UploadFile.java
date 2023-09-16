package lesson26;

import init.InitialDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UploadFile extends InitialDriver {

    @Test
    public void optionExampleTest() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement fileUpload = driver.findElement(By.id("file-upload"));
        fileUpload.sendKeys("/home/vstarchevskyi/Заказ/Zakaz Projects/QA Local Project/AQA_Hillel_0906_Java/rozetkaTest.txt");

        WebElement uploadBtn = driver.findElement(By.id("file-submit"));
        uploadBtn.submit();
    }
}
