package action;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.internal.RestAssuredResponseImpl;
import utility.BasePath;
import utility.Request;

/**
 * This class is used to send requests
 */
public class ExampleAction {
    private RequestSpecBuilder requestSpecBuilder;

    public ExampleAction() {
        requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setBasePath(BasePath.EXAMPLE_BASE_PATH);
    }

    public RestAssuredResponseImpl exampleMethodForSendingRequest(String formatId) {
        requestSpecBuilder.addPathParam("formatId", formatId);

        return new Request().get(requestSpecBuilder.build());
    }
}
