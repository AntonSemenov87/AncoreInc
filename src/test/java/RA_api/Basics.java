package RA_api;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

import org.testng.annotations.Test;

public class Basics {

    public static void main(String[] args) {
        //validate if API is working as expected
        //given --> all input details
        //when --> submit API
        //then --> validate response

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        given().log().all()
                .queryParam("key", "qaclick123").
                header("Content-Type", "application/json").
                body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -38.383494,\n" +
                        "    \"lng\": 33.427362\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Club House\",\n" +
                        "  \"phone_number\": \"(+91) 983 893 3937\",\n" +
                        "  \"address\": \"7226 W Belden ave\",\n" +
                        "  \"types\": [\n" +
                        "    \"shoe park\",\n" +
                        "    \"shop\"\n" +
                        "  ],\n" +
                        "  \"website\": \"http://www.clubhouse.com\",\n" +
                        "  \"language\": \"Russian-EN\"\n" +
                        "}").
        when()
                .post("maps/api/place/add/json").
        then().log().all()
                .assertThat().statusCode(200);

    }

}
