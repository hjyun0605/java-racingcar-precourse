package racingcar.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarNameTest {
	@Test
	void carName_FiveLettersName_ShouldSuccess() {
		String name = "abcde";
		CarName carName = new CarName(name);
		assertThat(carName.getName()).isEqualTo(name);
	}

	@Test
	void carName_SixLettersName_ShouldReturnError() {
		String name = "abcdef";
		assertThat(catchThrowable(() -> new CarName(name)))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
