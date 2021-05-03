package racingcar.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		String name = "abcde";
		car = new Car(name);
	}

	@Test
	void car_FiveLettersName_ShouldSuccess() {
		assertThat(car.getName()).isEqualTo("abcde");
	}

	@Test
	void car_SixLettersName_ShouldReturnError() {
		String name = "abcdef";
		assertThat(catchThrowable(() -> new Car(name)))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void move_ShouldIncreasePosition() {
		assertThat(car.move()).isEqualTo(1);
		assertThat(car.move()).isEqualTo(2);
		assertThat(car.move()).isEqualTo(3);
	}

	@Test
	void toString_ShouldReturnNameAndPosition() {
		car.move();
		assertThat(car.toString()).isEqualTo("abcde : 1");
	}
}
