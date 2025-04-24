package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import javaclasses.Q12;
import java.text.ParseException;

import org.junit.jupiter.api.Test;

class Q12Test {
	Q12 obj = new Q12();

	@Test
	void testValidDateFormatting() throws ParseException {
        String formattedDate = obj.formatDate("2025-04-26");
        assertEquals("26-04-2025", formattedDate);
    }
	
	@Test
	 void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> {
            obj.formatDate("26/04/2025");
        });
	}
	
	@Test
	void testCompletelyWrongDate() {
        assertThrows(ParseException.class, () -> {
            obj.formatDate("invalid-date");
        });
    }
}
