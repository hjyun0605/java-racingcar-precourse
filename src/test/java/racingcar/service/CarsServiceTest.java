package racingcar.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarsServiceTest {

	private CarsService carsService;

	@BeforeEach
	void setUp() {
		carsService = new CarsService();
	}

	@Test
	void initCars_WhenNormalName_ShouldReturnTrue() {
		String carNamesStr = "abcde,fghij,k,l,m,nop";
		assertThat(carsService.initCars(carNamesStr)).isTrue();
	}

	@Test
	void initCars_WhenNameLenExceedMax_ShouldReturnFalse() {
		String carNamesStr = "abcdefgh";
		assertThat(carsService.initCars(carNamesStr)).isFalse();
	}
}
