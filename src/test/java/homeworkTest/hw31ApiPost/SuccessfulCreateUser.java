package homeworkTest.hw31ApiPost;

import org.testng.Assert;
import org.testng.annotations.Test;

import static homeworkTest.hw31ApiPost.Specification.*;
import static io.restassured.RestAssured.given;

public class SuccessfulCreateUser {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void createUserTest() {
        configuration(requestSpecification(BASE_URL), responseSpecification(201));

        UserDataCreate user = new UserDataCreate("morpheus", "leader");

        UserCreated userCreated = given()
                .body(user)
                .when()
                .post("api/users")
                .then().log().all()
                .extract().as(UserCreated.class);

        Assert.assertEquals(userCreated.getId(),"624");
    }
}
