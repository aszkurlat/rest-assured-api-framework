package utils;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {

    public static JsonPath rawToJson(String response)
    {
        JsonPath js;
        js = new JsonPath(response);
        return js;
    }

}