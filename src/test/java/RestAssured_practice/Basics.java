package RestAssured_practice;


import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static  org.hamcrest.Matchers.*;

public class Basics {
    public static void main(String[] args) {

        // validate if Add Place API is working
        // given, when, then
        // given --> all input details
        // when --> submit the API -- http method and resource
        // then --> validate the response

        // Task 1 - create a place
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json").
                body(Payload.addPlace())
                .when().post("maps/api/place/add/json")
                .then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
                .header("server", "Apache/2.4.18 (Ubuntu)")
                .extract().response().asString();


        // System.out.println(response);


        // Task 2 - update a place, get place_id number and re-use it

        JsonPath js = new JsonPath(response); // for parsing Json - String into Json format
        String place_id = js.getString("place_id");

        System.out.println(place_id);



    }
}
