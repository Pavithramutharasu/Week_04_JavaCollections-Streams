package testclasses;

import static org.junit.jupiter.api.Assertions.*;
import javaclasses.Q11;

import org.junit.jupiter.api.Test;

class Q11Test {
	Q11 obj = new Q11();

	@Test
	void testCelsiusToFahrenheitZero() {
        double result = obj.celsiusToFahrenheit(0);
        assertEquals(32.0, result, 0.0001);
    }
	
	@Test
	void testCelsiusToFahrenheitHundred() {
        double result = obj.celsiusToFahrenheit(100);
        assertEquals(212.0, result, 0.0001);
    }
	
	@Test
	void testFahrenheitToCelsiusThirtyTwo() {
        double result = obj.fahrenheitToCelsius(32);
        assertEquals(0.0, result, 0.0001);
    }
	
	@Test
	void testFahrenheitToCelsiusTwoTwelve() {
        double result = obj.fahrenheitToCelsius(212);
        assertEquals(100.0, result, 0.0001);
    }

}
