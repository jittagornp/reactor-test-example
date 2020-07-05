package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoErrorTest {

    @Test
    public void shouldBeErrorRuntimeException_whenInputIsMonoJustOrEmpty() {

        final Mono<Object> input = Mono.justOrEmpty(null)
                .switchIfEmpty(Mono.error(new RuntimeException("Not found data")));

        StepVerifier.create(input)
                .expectError(RuntimeException.class)
                .verify();

    }

    @Test
    public void shouldBeErrorNotFoundData_whenInputIsMonoJustOrEmpty() {

        final Mono<Object> input = Mono.justOrEmpty(null)
                .switchIfEmpty(Mono.error(new RuntimeException("Not found data")));

        StepVerifier.create(input)
                .expectErrorMessage("Not found data")
                .verify();

    }
}
