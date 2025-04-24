package testclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javaclasses.Q1;
import org.junit.jupiter.api.Test;

class Q1Test {
    Q1 obj = new Q1();

    @Test
    void testAddition() {
        assertEquals(6, obj.add(2, 4));
    }
    @Test
    void testsub() {
    	assertEquals(5,obj.subtract(10,5));
    }
    @Test
    void testmul() {
    	assertEquals(24,obj.multiply(6, 4));
    }
    @Test
    void DivideTest(){

        assertThrows(ArithmeticException.class , () -> {
            obj.divide(10,0);
        },"Division by Zero Error occurred!");
    }
}
