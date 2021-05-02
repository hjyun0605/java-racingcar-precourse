package racingcar.service;

import java.util.Arrays;

import racingcar.model.Cars;
import racingcar.utils.RandomUtils;

public class CarsService {
	public static final String REGEX_CAR_NAME_SPLIT = ",";

	private Cars cars;

	public void initCars(String carNames) {
		cars = new Cars(Arrays.asList(carNames.split(REGEX_CAR_NAME_SPLIT)));
	}

	public Cars getCars() {
		return cars;
	}

	public void move() {
		for (int i = 0; i < cars.getSize(); i++) {
			cars.moveCar(i, RandomUtils.getZeroToNineRandomValue());
		}
	}
}
