package racingcar.service;

import java.util.Scanner;

public class InputService {
	public static final String MESSAGE_INPUT_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String MESSAGE_INPUT_COUNT = "시도할 회수는 몇회인가요?";
	public static final Scanner scanner = new Scanner(System.in);

	public static String getCarNames() {
		System.out.println(MESSAGE_INPUT_NAMES);
		return scanner.nextLine();
	}

	public static int getMoveCount() {
		System.out.println(MESSAGE_INPUT_COUNT);
		return scanner.nextInt();
	}
}
