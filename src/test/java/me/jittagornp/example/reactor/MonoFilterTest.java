package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoFilterTest {

    @Test
    public void shouldBe2_whenInputIsMonoJust2() {

        final Mono<Integer> input = Mono.just(2)
                .filter(number -> (number % 2 == 0));

        StepVerifier.create(input)
                .expectNext(2)
                .verifyComplete();

    }

    @Test
    public void shouldBeEmpty_whenInputIsMonoJust3() {

        final Mono<Integer> input = Mono.just(3)
                .filter(number -> (number % 2 == 0));

        StepVerifier.create(input)
                .expectNextCount(0)
                .verifyComplete();

    }

}
