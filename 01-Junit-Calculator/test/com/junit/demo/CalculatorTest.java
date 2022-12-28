package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	// To use @Test annotation add Junit library into your project using build path.
	@Test
	public void testIntegerDivision() {
		Calculator calc = new Calculator();
		int result = calc.integerDivision(2, 4);
		// Using a message in assertEquals is completely optional.
		// The message used in assertEquals will be displayed on test case failure.
		assertEquals(2, result, "4/2 mathematic operation did not produce desired result");
	}

}
