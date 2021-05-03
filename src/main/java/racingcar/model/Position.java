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

	public int comparePosition(Position position) {
		return this.position - position.getPosition();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Position position1 = (Position)o;

		return position == position1.position;
	}

	@Override
	public int hashCode() {
		return position;
	}
}
