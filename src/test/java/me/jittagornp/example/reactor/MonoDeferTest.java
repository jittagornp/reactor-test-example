package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoDeferTest {

    @Test
    public void shouldBeJittagornp_whenInputIsMonoDefer_andMonoJustJittagornp() {

        final Mono<String> input = Mono.defer(() -> Mono.just("jittagornp"));

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
