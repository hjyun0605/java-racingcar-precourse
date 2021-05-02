package racingcar.model;

import static org.assertj.core.api.Java6Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CarsTest {

	@Test
	void initCars_ShouldSuccess() {
		List<String> carNames = new ArrayList<>();
		carNames.add("abc");
		carNames.add("def");
		Cars cars = new Cars(carNames);
		assertThat(cars.getSize()).isEqualTo(2);
	}
}
