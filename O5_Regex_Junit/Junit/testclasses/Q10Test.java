package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javaclasses.Q10;

class Q10Test {
	Q10 obj = new Q10();

	@Test
	void testValidPassword() {
        assertTrue(obj.isValid("StrongPass1"));
    }
	
	@Test
	void testPasswordTooShort() {
        assertFalse(obj.isValid("S1hort"));
    }
	
	@Test
	void testPasswordWithoutUppercase() {
        assertFalse(obj.isValid("strongpass1"));
    }
	
	@Test
	void testPasswordWithoutDigit() {
        assertFalse(obj.isValid("StrongPass"));
    }
	
	@Test
	 void testNullPassword() {
        assertFalse(obj.isValid(null));
    }

}
