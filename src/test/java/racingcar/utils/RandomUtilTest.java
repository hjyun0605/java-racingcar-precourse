package racingcar.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RandomUtilTest {
	@Test
	void getZeroToNineRandomValue_ShouldReturn0To9() {
		assertThat(RandomUtils.getZeroToNineRandomValue())
			.isLessThan(10).isGreaterThanOrEqualTo(0);
	}
}
