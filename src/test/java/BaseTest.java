import io.restassured.RestAssured;

public class BaseTest {

    public BaseTest() {
        String baseUri = System.getProperty("baseUri");
        if (baseUri == null) {
            baseUri = "default url";
        }
        RestAssured.baseURI = baseUri;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
