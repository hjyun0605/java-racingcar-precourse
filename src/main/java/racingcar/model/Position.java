package racingcar.model;

public class Position {
	private int position = 0;

	public int addPosition() {
		position += 1;
		return position;
	}

	public int getPosition() {
		return position;
	}
}
