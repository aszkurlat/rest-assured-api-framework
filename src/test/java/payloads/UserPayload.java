package payloads;

public class UserPayload {

    public static String createUserPayload() {

        return "{\n" +
                "  \"name\": \"Anna\",\n" +
                "  \"job\": \"QA Engineer\"\n" +
                "}";
    }
    public static String updateUserPayload() {

        return "{\n" +
                "  \"name\": \"Anna Updated\",\n" +
                "  \"job\": \"Senior QA\"\n" +
                "}";
    }
}