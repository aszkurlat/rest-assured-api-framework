package payloads;

public class UserPayload {

    public static String createUserPayload() {

        return "{\n" +
                "  \"name\": \"Anna\",\n" +
                "  \"job\": \"QA Engineer\"\n" +
                "}";
    }
}