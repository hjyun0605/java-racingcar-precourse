package racingcar.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsServiceTest {

	private CarsService carsService;

	@BeforeEach
	void setUp() {
		String carNamesStr = "abcde,fghij,k,l,m,nop";
		carsService = new CarsService();
		carsService.initCars(carNamesStr);
	}

	@Test
	void initCars_ShouldCarSize6() {
		assertThat(carsService.getCars().getSize()).isEqualTo(6);
	}
}
