package de.egga.paved_road;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static io.restassured.RestAssured.given;
import static net.javacrumbs.jsonunit.JsonMatchers.jsonEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    @Test
    public void it_should_return_status_code() {
        given().port(port)
                .when().get("/hello")
                .then().statusCode(200);
    }

    @Test
    public void it_should_return_hello_object() throws Exception {
        given().port(port)
                .when().get("/hello")
                .then().body(jsonEquals("{'greeting': 'yo', 'addressee': 'egga'}"));

    }
}
