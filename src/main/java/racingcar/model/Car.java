package racingcar.model;

public class Car {
	private final CarName name;
	private final Position position = new Position();

	public Car(String name) {
		this.name = new CarName(name);
	}

	public String getName() {
		return name.getName();
	}

	public int move() {
		return position.addPosition();
	}

	public Position getPosition() {
		return position;
	}
	public int getPositionValue() {
		return position.getPosition();
	}

	public boolean isEqualPosition(Position position) {
		return this.position.equals(position);
	}

	public int comparePosition(Position position) {
		return this.position.comparePosition(position);
	}

	@Override
	public String toString() {
		return String.format("%s : %d", name.getName(), getPositionValue());
	}
}
