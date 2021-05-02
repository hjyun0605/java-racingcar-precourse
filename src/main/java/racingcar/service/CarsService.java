package racingcar.service;

import java.util.Arrays;

import racingcar.model.Cars;

public class CarsService {
	public static final String REGEX_CAR_NAME_SPLIT = ",";

	private Cars cars;

	public void initCars(String carsStr) {
		cars = new Cars(Arrays.asList(carsStr.split(REGEX_CAR_NAME_SPLIT)));
	}

	public Cars getCars() {
		return cars;
	}
}
