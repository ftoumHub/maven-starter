package hello;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {

	@Test
	public void greeterSaysHello() {
		assertThat(Greeter.buildGreeting("Georges")).isEqualTo("Greeter says : Hello Georges");
	}

}