package de.egga.paved_road.hello;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Hello(

        @JsonProperty("greeting")
        String message,

        @JsonProperty("addressee")
        String addressee
) {
}
