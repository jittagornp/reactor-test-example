package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoTest {

    @Test
    public void shouldBeJittagornp_whenInputIsMonoJittagornp() {

        final Mono<String> input = Mono.just("jittagornp");

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
