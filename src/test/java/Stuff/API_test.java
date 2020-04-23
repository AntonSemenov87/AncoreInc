package Stuff;

import static io.restassured.RestAssured.*;

import files.Payload;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static  org.hamcrest.Matchers.*;

public class API_test {

    @Test
    public void checkCreateAPI () {
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(Payload.addPlace())
                .when().post("maps/api/place/add/json")
                .then().log().all().statusCode(200);
    }

}
