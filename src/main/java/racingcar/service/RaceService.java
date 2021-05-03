package racingcar.service;

public class RaceService {

	private final CarsService carsService = new CarsService();

	public void playRace() {
		initCars();
		moveAndRelay();
		showWinners();
	}

	private void initCars() {
		String carNames;
		do {
			carNames = InputService.getCarNames();
		} while(!carsService.initCars(carNames));
	}

	private void moveAndRelay() {
		int moveCount = InputService.getMoveCount();
		for (int i = 0; i < moveCount; i++) {
			carsService.move();
			carsService.relay();
		}
	}

	private void showWinners() {
		carsService.showWinners();
	}
}
