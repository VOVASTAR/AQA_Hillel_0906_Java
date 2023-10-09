package homeworkTest.hw31ApiPost;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Clock;

import static homeworkTest.hw31ApiPost.SpecificationHw.*;
import static io.restassured.RestAssured.given;

public class SuccessfulCreateUser {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void createUserTest() {
        configuration(requestSpecification(BASE_URL), responseSpecification(201));

        UserDataCreateHw user = new UserDataCreateHw("morpheus", "leader");

        UserCreatedHw userCreated = given()
                .body(user)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(UserCreatedHw.class);


        int userIdNumber = Integer.parseInt(userCreated.getId());
        String currentTime = Clock.systemUTC().instant().toString();
        String regex = "\\..*";

        Assert.assertEquals(userCreated.getName(), user.getName());
        Assert.assertEquals(userCreated.getJob(), user.getJob());
        Assert.assertTrue(userIdNumber < 1000);
        Assert.assertEquals(userCreated.getCreatedAt().replaceAll(regex, ""), currentTime.replaceAll(regex, ""));
    }
}
