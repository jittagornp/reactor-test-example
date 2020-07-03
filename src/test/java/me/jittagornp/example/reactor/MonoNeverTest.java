package me.jittagornp.example.reactor;

import java.time.Duration;
import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoNeverTest {

    @Test
    public void shouldBeTimeout_whenInputIsMonoNever() {

        final Mono<String> input = Mono.never();

        StepVerifier.create(input)
                .expectNextCount(0)
                .expectTimeout(Duration.ofMillis(100))
                .verify();
    }

}
