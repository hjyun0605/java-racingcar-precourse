package racingcar.model;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionTest {
	private Position position;

	@BeforeEach
	void setUp() {
		position = new Position();
	}

	@Test
	void addPosition() {
		assertThat(position.addPosition()).isEqualTo(1);
		assertThat(position.addPosition()).isEqualTo(2);
		assertThat(position.addPosition()).isEqualTo(3);
	}

	@Test
	void comparePosition() {
		Position newPosition = new Position();
		assertThat(position.comparePosition(newPosition)).isEqualTo(0);
		position.addPosition();
		assertThat(position.comparePosition(newPosition)).isGreaterThan(0);
		newPosition.addPosition();
		newPosition.addPosition();
		assertThat(position.comparePosition(newPosition)).isLessThan(0);
	}

	@Test
	void isEqualPosition() {
		Position newPosition = new Position();
		assertThat(position.equals(newPosition)).isTrue();
		position.addPosition();
		assertThat(position.equals(newPosition)).isFalse();
	}
}
