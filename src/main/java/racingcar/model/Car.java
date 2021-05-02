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

	public int getPosition() {
		return position.getPosition();
	}

	@Override
	public String toString() {
		return String.format("%s : %d", name.getName(), getPosition());
	}
}
