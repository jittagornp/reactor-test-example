package me.jittagornp.example.reactor;

import org.junit.Test;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

/**
 * @author jitta
 */
public class MonoCreateTest {

    @Test
    public void shouldBeTimeout500Millisec_whenInputIsMonoCreate_thenDelay1000Millisec() {

        final Mono<String> input = Mono.create(callback -> {
            try {
                //delay 100 millisec
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                //
            }
            callback.success("jittagornp");
        });

        StepVerifier.create(input)
                .expectNext("jittagornp")
                .verifyComplete();

    }

}
