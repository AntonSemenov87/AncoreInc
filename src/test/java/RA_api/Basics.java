package RA_api;

import static io.restassured.RestAssured.*;

import files.Payload;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Basics {

    public static void main(String[] args) {
        //validate if API is working as expected
        //given --> all input details
        //when --> submit API
        //then --> validate response

        RestAssured.baseURI = "https://rahulshettyacademy.com";
String response = given().log().all()
                .queryParam("key", "qaclick123").
                header("Content-Type", "application/json").
                body(Payload.addPlace()).
        when()
                .post("maps/api/place/add/json").
        then()
                .assertThat().statusCode(200)
                .body("scope", equalTo("APP"))
                .header("Server", equalTo("Apache/2.4.18 (Ubuntu)"))
        .extract().response().asString();

        System.out.println(response);

        JsonPath jp = new JsonPath(response);
        String placeId = jp.getString("place_id");
        System.out.println(placeId);


        // Update place with new address (change it in Payload.addPlace())
        String newAddress = "1914 W Division Street, Chicago";

        given()
                .log().all().queryParam("key", "qaclick123")
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "\"place_id\":\"" + placeId + "\",\n" +
                        "\"address\":\"" + newAddress + "\",\n" +
                        "\"key\":\"qaclick123\"\n" +
                        "}")
        .when()
                .put("maps/api/place/update/json")
        .then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));

        // Get place in order to see if address is updated

        String getResponse = given()
                .log().all().queryParam("key", "qaclick123").queryParam("place_id", placeId)
        .when()
                .get("maps/api/place/get/json")
        .then()
                .log().all().assertThat().statusCode(200)
        .extract().response().asString();


        JsonPath jpGetResponse = ReusableMethods.rawToJson(getResponse);
        String actualAddress = jpGetResponse.getString("address");
        System.out.println(actualAddress);

        Assert.assertEquals(actualAddress,newAddress);

    } 

}
