package me.jittagornp.example.reactor;

import java.time.Duration;
import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoEmptyTest {

    @Test
    public void shouldBeComplete_whenInputIsMonoEmpty() {

        final Mono<String> input = Mono.empty();

        StepVerifier.create(input)
                .expectNextCount(0)
                .expectComplete()
                .verify();
    }

}
