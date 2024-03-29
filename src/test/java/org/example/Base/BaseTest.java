package org.example.Base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.example.Actions.AssertActions;
import org.example.Endpoints.APIConstants;
import org.example.Modules.PayloadManager;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public RequestSpecification requestSpecification;
    public AssertActions assertActions;
    public PayloadManager payloadManager;
    public JsonPath jsonPath;
    public Response response;
    public ValidatableResponse validatableResponse;
    @BeforeMethod
    public void setConfig(){
        payloadManager=new PayloadManager();
        assertActions=new AssertActions();
        requestSpecification= new RequestSpecBuilder()
                .setBaseUri(APIConstants.BASE_URL)
                .addHeader("Content-Type","application/json")
                .build().log().all();
    }
}
