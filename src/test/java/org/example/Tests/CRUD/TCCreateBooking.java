package org.example.Tests.CRUD;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.example.Base.BaseTest;
import org.example.Endpoints.APIConstants;
import org.testng.annotations.Test;

public class TCCreateBooking extends BaseTest {
    @Owner("Archana")
    @Description("Verify create booking with valid payload,Status Code 200")
    @Test
    public void testPositivePOSTReq(){
    requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
    response= RestAssured.given().spec(requestSpecification)
            .when().body(payloadManager.CreatePayload()).post();
    validatableResponse=response.then().log().all();
    validatableResponse.statusCode(200);
    }
}
