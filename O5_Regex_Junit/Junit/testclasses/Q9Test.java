package testclasses;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javaclasses.Q9;
class Q9Test {

	@Test
	void Deposittest() {
		Q9 obj = new Q9(100.0);
		obj.deposit(50.0);
		assertEquals(150.0, obj.getBalance(), 0.001);
	}
	
	@Test
    void testWithdraw() {
        Q9 obj = new Q9(200.0);
        obj.withdraw(80.0);
        assertEquals(120.0, obj.getBalance(), 0.001);
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Q9 obj = new Q9(50.0);
        assertThrows(IllegalArgumentException.class, () -> obj.withdraw(100.0));
    }

    @Test
    void testDepositNegativeAmount() {
        Q9 obj = new Q9(100.0);
        assertThrows(IllegalArgumentException.class, () -> obj.deposit(-50.0));
    }

}
