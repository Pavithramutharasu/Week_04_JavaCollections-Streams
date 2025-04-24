package testclasses;

import org.junit.jupiter.api.*;


import javaclasses.Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q2Test {
	Q2 obj = new Q2();

	@Test
	public void Palintest() {
		assertTrue(obj.isPalin("malayalam"));
	}
	@Test
	public void reverseTest() {
		assertEquals("avaj",obj.reverse("java"));
	}
	@Test
	public void UpperTest() {
		assertEquals("JAVA",obj.Upper("java"));
	}
	@AfterAll
    public static void Print1(){
        System.out.println("All the test cases are cleared!!");
    }
}
