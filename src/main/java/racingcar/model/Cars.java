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

	public List<Car> getWinners() {
		Position maxPosition = new Position();
		List<Car> winners = new ArrayList<>();
		for (Car car : cars) {
			maxPosition = addToWinner(winners, car, maxPosition);
		}
		return winners;
	}

	private Position addToWinner(List<Car> winners, Car car, Position maxPosition) {
		if (car.comparePosition(maxPosition) > 0) {
			winners.clear();
			winners.add(car);
			return car.getPosition();
		}
		if (car.isEqualPosition(maxPosition) ) {
			winners.add(car);
		}
		return maxPosition;
	}
}