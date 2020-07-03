package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoDefaultIfEmptyTest {

    @Test
    public void shouldBeJittagornp_whenInputIsMonoJustOrEmpty() {

        final Mono<Object> input = Mono.justOrEmpty(null)
                .defaultIfEmpty("jittagornp");

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
