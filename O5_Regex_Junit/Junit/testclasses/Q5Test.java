package testclasses;

import static org.junit.jupiter.api.Assertions.*;
import javaclasses.Q5;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;


import org.junit.jupiter.api.Test;

class Q5Test {
	Q5 obj;
	
	@BeforeEach
	public void setup() {
		obj = new Q5();
	}

	@Test
	public void coonectTest() {
		assertEquals(obj.connect(),"Database connected");
	}
	
	@Test
	public void disconnectTest() {
		assertEquals(obj.disconnect(),"Database disconnected");
	}
	
	@AfterAll
	public static void complete() {
		System.out.println("Testcases passed");
	}
}
