package de.egga.paved_road.unit;

import de.egga.paved_road.hello.Hello;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloTest {

    public static final String ANY_GREETING = "hi";
    public static final String ANY_ADDRESSEE = "sis";

    @Test
    void addresseeShouldBeIdentical() {
        Hello hello = new Hello(ANY_GREETING, "sista");
        assertThat(hello.addressee()).isEqualTo("sista");
    }

    @Test
    void greetingShouldBeIdentical() {
        Hello hello = new Hello("ah yeah", ANY_ADDRESSEE);
        assertThat(hello.message()).isEqualTo("ah yeah");
    }
}
