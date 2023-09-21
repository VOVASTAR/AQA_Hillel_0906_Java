package lessonsTests.lesson26;

import lessonsTests.init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckStatusCode extends InitialDriver {

    @Test
    public void checkStatusCodeTest() throws IOException {

        HttpURLConnection connection = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/200").openConnection();
//        Not required
//        connection.connect();
        int response = connection.getResponseCode();
        System.out.println(response);
        Assert.assertEquals(response, 200, "Status code is not 200");
    }
}
