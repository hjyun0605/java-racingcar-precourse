package racingcar.model;

import static org.assertj.core.api.Java6Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsTest {
	private Cars cars;

	@BeforeEach
	void setUp() {
		List<String> carNames = new ArrayList<>();
		carNames.add("abc");
		carNames.add("def");
		carNames.add("ghr");
		cars = new Cars(carNames);
	}

	@Test
	void cars_ShouldHasCars() {
		assertThat(cars.getSize()).isEqualTo(3);
	}

	@Test
	void moveCar_WhenGreaterThan3_ShouldMove() {
		cars.moveCar(0, 4);
		cars.moveCar(0, 5);
		cars.moveCar(1, 6);

		assertThat(cars.getCar(0).getPositionValue()).isEqualTo(2);
		assertThat(cars.getCar(1).getPositionValue()).isEqualTo(1);
	}

	@Test
	void moveCar_WhenLessThan4_ShouldNotMove() {
		cars.moveCar(1, 3);
		cars.moveCar(1, 2);
		cars.moveCar(2, 1);

		assertThat(cars.getCar(1).getPositionValue()).isEqualTo(0);
		assertThat(cars.getCar(2).getPositionValue()).isEqualTo(0);
	}

	@Test
	void getWinners() {
		cars.moveCar(0, 4);
		cars.moveCar(0, 5);
		cars.moveCar(1, 6);
		cars.moveCar(1, 6);

		List<Car> winners = cars.getWinners();
		assertThat(winners.get(0).getName()).isEqualTo("abc");
		assertThat(winners.get(1).getName()).isEqualTo("def");
		assertThat(winners.get(1).getPositionValue()).isEqualTo(2);
	}
}
