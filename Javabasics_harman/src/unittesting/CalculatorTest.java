package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		int expected = 40;
		int actual = Calculator.add(10, 20);
		assertEquals(expected, actual);
	}

}
