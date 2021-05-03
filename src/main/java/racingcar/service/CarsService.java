package racingcar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import racingcar.model.Car;
import racingcar.model.Cars;
import racingcar.utils.RandomUtils;

public class CarsService {
	public static final String REGEX_CAR_NAME_SPLIT = ",";

	private Cars cars;

	public boolean initCars(String carNames) {
		try {
			cars = new Cars(Arrays.asList(carNames.split(REGEX_CAR_NAME_SPLIT)));
			return true;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public void move() {
		for (int i = 0; i < cars.getSize(); i++) {
			cars.moveCar(i, RandomUtils.getZeroToNineRandomValue());
		}
	}

	public void relay() {
		for (Car car : cars.getCars()) {
			System.out.println(car.toString());
		}
		System.out.println();
	}

	public void showWinners() {
		List<String> names = new ArrayList<>();
		for (Car car : cars.getWinners()) {
			names.add(car.getName());
		}
		OutputService.printWinners(names);
	}
}
