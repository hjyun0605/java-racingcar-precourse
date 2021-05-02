package racingcar.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import racingcar.model.Cars;

public class CarsServiceTest {

	@Test
	void initCars_ShouldSuccess() {
		String carNamesStr = "abcde,fghij,k,l,m,nop";
 		CarsService carsService = new CarsService();
 		carsService.initCars(carNamesStr);
		assertThat(carsService.getCars().size()).isEqualTo(6);
	}
}
