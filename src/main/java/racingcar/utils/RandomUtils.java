package racingcar.utils;

import java.util.Random;

public class RandomUtils {
	public static int getZeroToNineRandomValue() {
		Random random = new Random();
		return random.nextInt(10);
	}
}
