package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import javaclasses.Q4;

import org.junit.jupiter.api.Test;

class Q4Test {
	Q4 obj = new Q4();

	@Test
	void divisiontest() {
		assertThrows(ArithmeticException.class, () -> {
			obj.division(10, 0);
		});
	}
}
