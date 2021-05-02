package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
	public static final int SEED_THRESHOLD = 4;

	private List<Car> cars;

	public Cars(List<String> carNames) {
		initCars(carNames);
	}

	private void initCars(List<String> carNames) {
		cars = new ArrayList<>();
		for (String name : carNames) {
			cars.add(new Car(name));
		}
	}

	public int getSize() {
		return cars.size();
	}

	public List<Car> getCars() {
		return cars;
	}

	public Car getCar(int carIndex) {
		return cars.get(carIndex);
	}

	public void moveCar(int carIndex, int seed) {
		if (seed >= SEED_THRESHOLD) {
			cars.get(carIndex).move();
		}
	}
}
