package lessonsTests.lesson32;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstClassLangFromJenkins {

    final String LANG_FROM_JENKINS = System.getenv("LANG_FROM_JENKINS");

    @Test
    public void successTest() {
        if(LANG_FROM_JENKINS.equals("UA")){
            Assert.assertEquals(5, 5);
            System.out.println("LANG_FROM_JENKINS = UA");
        } else {
            Assert.assertEquals(8, 8);
            System.out.println("LANG_FROM_JENKINS = OTHER");
        }
    }
}

