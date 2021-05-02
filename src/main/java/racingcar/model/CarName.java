package racingcar.model;

public class CarName {
	public static final int MAX_LENGTH = 5;
	public static final String ERROR_MESSAGE_MAX_LENGTH = "이름은 5글자 이하입니다.";

	private final String name;

	public CarName(String name) {
		validName(name);
		this.name = name;
	}

	private void validName(String name) {
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException(ERROR_MESSAGE_MAX_LENGTH);
		}
	}

	public String getName() {
		return name;
	}
}
