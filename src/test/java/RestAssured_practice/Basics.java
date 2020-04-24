package RestAssured_practice;


import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

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

        String output = given().log().all().queryParam("key", "qaclick123")
                .header("Content-Type","application/json")
                .body(Payload.addPlace()    ).when().post("/maps/api/place/add/json").then()
                .header("Server", "Apache/2.4.18 (Ubuntu)")
                .body("scope", equalTo("APP"))
                .log().all().assertThat().statusCode(200).extract().response().asString();

        System.out.println(output);


        // System.out.println(response);

//        JsonPath js = new JsonPath(response); // for parsing Json
//        String place_id = js.getString("place_id");
//
//        System.out.println(place_id);


        // Task 2 - update a place, get place_id number and re-use it
//        String newAddress = "1914 W Division Street, Chicago";
//
//        given().log().all().queryParam("key", "qaclick123").header("Content-Type", "applicatopn/json")
//                .body("{\n" +
//                        "\"place_id\":\"" + place_id + ",\n" +
//                        "\"address\":\"" + newAddress + "\",\n" +
//                        "\"key\":\"qaclick123\"\n" +
//                        "}")
//                .when().put("maps/api/place/update/json")
//                .then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
//
//        // Get place to check if address is updated
//
//        String getPlaceResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
//                .when().get("maps/api/place/get/json")
//                .then().assertThat().log().all().statusCode(200).extract().response().asString();
//
//        JsonPath js1 = ReusableMethods.rawToJason(getPlaceResponse);
//        String actualAddress = js1.getString("address");
//        Assert.assertEquals(actualAddress,newAddress);



    }
}
