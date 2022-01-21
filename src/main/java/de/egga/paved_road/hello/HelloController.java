package de.egga.paved_road.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello index() {
        return new Hello("yo", "egga");
    }
}

record Hello(String message, String addressee) {

}
