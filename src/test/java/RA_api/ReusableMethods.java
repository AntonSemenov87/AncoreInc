package RA_api;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

    public static JsonPath rawToJson (String response) {
        JsonPath jpGetResponse = new JsonPath(response);
        return jpGetResponse;
    }

}
