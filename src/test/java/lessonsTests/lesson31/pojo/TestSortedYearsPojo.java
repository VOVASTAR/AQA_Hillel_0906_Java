package lessonsTests.lesson31.pojo;


import lessonsTests.lesson31.YearsData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;
import static lessonsTests.lesson31.Specification.*;

public class TestSortedYearsPojo {

    private final String BASE_URL = "https://reqres.in/";

    @Test
    public void testListResource() {
        configureSpec(requestSpecification(BASE_URL), responseSpecification(200));
        List<YearsData> yearsDataList = given()
                .when()
                .get("api/unknown")
                .then().log().all()
                .extract().body().jsonPath().getList("data", YearsData.class);
        List<Integer> yearActual = yearsDataList.stream().map(YearsData::getYear).toList();
        List<Integer> expectedActual = yearActual.stream().sorted().toList();
        Assert.assertEquals(expectedActual, yearActual);
    }
}