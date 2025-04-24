package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import javaclasses.Q13;

import org.junit.jupiter.api.Test;

class Q13Test {
	Q13 obj = new Q13();

	@Test
	void testValidUserRegistration() {
        assertDoesNotThrow(() -> obj.registerUser("validUser", "user@example.com", "validPass123"));
    }
	
	@Test
	void testEmptyUsername() {
        assertThrows(IllegalArgumentException.class, () -> {
            obj.registerUser("", "user@example.com", "validPass123");
        });
    }
	
	@Test
	void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class, () -> {
            obj.registerUser("validUser", "invalidEmail", "validPass123");
        });
    }
	
	@Test
	void testShortPassword() {
        assertThrows(IllegalArgumentException.class, () -> {
            obj.registerUser("validUser", "user@example.com", "short");
        });
    }

}
