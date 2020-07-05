package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoSwitchIfEmptyTest {

    @Test
    public void shouldBeJittagornp_whenInputIsMonoJustOrEmpty() {

        final Mono<Object> input = Mono.justOrEmpty(null)
                .switchIfEmpty(Mono.just("jittagornp"));

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
