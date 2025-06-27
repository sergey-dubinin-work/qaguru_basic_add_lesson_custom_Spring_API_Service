package guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.controller;

import guru.qa.qaguru_basic_add_lesson_custom_spring_api_service.domain.UserInfo;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class BankControllerTest {

    static {
        RestAssured.baseURI = "http://localhost:8080";
    }

    @Test
    void bankControllerPositiveTest() {
        UserInfo[] userInfos = given()
                .when()
                .get("/user/getAll")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract().as(UserInfo[].class);

    }



}