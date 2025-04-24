package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import javaclasses.Q6;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Q6Test {
	Q6 obj = new Q6();
	@ValueSource(ints = {2,4,6,8,10,-2,0})

	@ParameterizedTest
	void isEventest(int num) {
		assertTrue(obj.check(num));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7,9,-1,-3,-5})
	
	void isOddtest(int num) {
		assertFalse(obj.check(num));
	}
}
