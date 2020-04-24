package RestAssured_practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class ReusableMethods {

    public static JsonPath rawToJason (String response) {
        JsonPath js1 = new JsonPath(response);
        return js1;
    }

    // not used yet
    public static void navigateTo (String url) {
        RestAssured.baseURI = url;
    }
}
