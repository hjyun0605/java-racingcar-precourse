package racingcar.service;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarsServiceTest {

	@Test
	void initCars_ShouldCarSize6() {
		String carNamesStr = "abcde,fghij,k,l,m,nop";
 		CarsService carsService = new CarsService();
 		carsService.initCars(carNamesStr);
		assertThat(carsService.getCars().getSize()).isEqualTo(6);
	}
}
