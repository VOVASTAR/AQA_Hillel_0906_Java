package lessonsTests.lesson28;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
//    @Test
//    public void simpleAssertExample() {
//        System.out.println("Simple assert - first assert");
//        Assert.assertEquals(5, 5);
//        System.out.println("Simple assert - second assert");
//        Assert.assertTrue("Hello".equals("hello"));
//    }

    @Test
    public void softAssertExample() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Soft assert - first assert");
        softAssert.assertEquals(3, 5);

        System.out.println("Soft assert - second assert");
        softAssert.assertTrue("Hello".equals("hello"));

        System.out.println("Soft assert - third assert");
        softAssert.assertEquals(5, 5);
        softAssert.assertAll();
    }
}
