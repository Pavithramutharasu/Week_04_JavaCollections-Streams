package testclasses;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import javaclasses.Q3;
class Q3Test {
	Q3 obj1 = new Q3();
	List<Integer> testlist = new ArrayList<>();

	@Test
	void testAddElement() {
		obj1.addElement(testlist,5);
		assertTrue(testlist.contains(5));
	}
	@Test
	void testremoveElement() {
		testlist.add(10);
		obj1.removeElement(testlist,10);
		assertFalse(testlist.contains(10));
	}
	@Test
	void testGetSize() {
        obj1.addElement(testlist, 1);
        obj1.addElement(testlist, 2);
        obj1.removeElement(testlist, 1);
        assertEquals(1, obj1.getSize(testlist));
	}

}
