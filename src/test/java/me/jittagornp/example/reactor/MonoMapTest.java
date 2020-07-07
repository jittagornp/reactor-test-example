package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoMapTest {

    @Test
    public void shouldBe2000_whenInputIsMonoJust1000() {

        final Mono<Integer> input = Mono.just(1000)
                .map(number -> number * 2);

        StepVerifier.create(input)
                .expectNext(2000)
                .verifyComplete();

    }

}
