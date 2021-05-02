package racingcar;

import racingcar.service.RaceService;

public class RacingCarApplication {
	public static void main(String[] args) {
		RaceService raceService = new RaceService();
		raceService.playRace();
	}
}
