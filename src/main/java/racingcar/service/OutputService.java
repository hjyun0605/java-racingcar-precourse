package racingcar.service;

import java.util.List;

public class OutputService {
	public static final String DELIMITER_NAME = ",";
	public static final String MESSAGE_WIN = "가 최종 우승했습니다.";

	public static void printWinners(List<String> winners) {
		System.out.printf("%s%s%n", String.join(DELIMITER_NAME, winners), MESSAGE_WIN);
	}
}
