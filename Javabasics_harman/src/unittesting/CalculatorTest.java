package unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	@BeforeClass
	void init() {
		System.out.println("init variables before starting any of the test");
	}

	@Test
	void testAdd() {
		int expected = 40;
		int actual = Calculator.add(10, 20);
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	void testMul() {
		int expected = 20;
		int actual = Calculator.multiply(5, 4);
		assertEquals(expected, actual);
	}

}
