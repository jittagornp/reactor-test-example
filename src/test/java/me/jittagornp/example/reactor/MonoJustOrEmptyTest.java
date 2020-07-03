package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoJustOrEmptyTest {

    @Test
    public void shouldBeComplete_whenInputIsMonoJustOrEmptyNull() {

        final Mono<String> input = Mono.justOrEmpty(null);

        StepVerifier.create(input)
                .expectNextCount(0)
                .verifyComplete();

    }

}
