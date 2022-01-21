package de.egga.paved_road.hello;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello index() {
        return new Hello("yo", "egga");
    }
}

record Hello(

        @JsonProperty("greeting")
        String message,

        @JsonProperty("addressee")
        String addressee
) { }
