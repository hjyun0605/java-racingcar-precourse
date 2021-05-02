package racingcar.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	void car_FiveLettersName_ShouldSuccess() {
		String name = "abcde";
		Car car = new Car(name);
		assertThat(car.getName()).isEqualTo(name);
	}

	@Test
	void car_SixLettersName_ShouldReturnError() {
		String name = "abcdef";
		assertThat(catchThrowable(() -> new Car(name)))
			.isInstanceOf(IllegalArgumentException.class);
	}
}
