package racingcar.model;

import java.util.ArrayList;
import java.util.List;

public class Cars {
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
}
