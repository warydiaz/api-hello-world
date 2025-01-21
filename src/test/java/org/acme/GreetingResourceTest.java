package org.acme;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingResourceTest {

    @Test
    public void shouldReturnHelloWorld() {
        GreetingResource resource = new GreetingResource();
        String result = resource.hello();
        Assertions.assertThat(result).isEqualTo("Hello World");
    }
}
