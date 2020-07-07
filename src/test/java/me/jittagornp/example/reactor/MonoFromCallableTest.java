package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoFromCallableTest {

    @Test
    public void shouldBeJittagornp_whenInputIsMonoFromCallableJittagornp() {

        final Mono<String> input = Mono.fromCallable(() -> "jittagornp");

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
