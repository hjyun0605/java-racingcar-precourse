package racingcar.model;

import java.util.List;

public class Cars {
	private List<String> cars;

	public Cars(List<String> carNames) {
		cars = carNames;
	}

	public List<String> getCars() {
		return cars;
	}

	public int size() {
		return cars.size();
	}
}
