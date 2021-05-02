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

	@Test
	void move_ShouldIncreasePosition() {
		Car car = new Car("abc");
		assertThat(car.move()).isEqualTo(1);
		assertThat(car.move()).isEqualTo(2);
		assertThat(car.move()).isEqualTo(3);
	}
}
