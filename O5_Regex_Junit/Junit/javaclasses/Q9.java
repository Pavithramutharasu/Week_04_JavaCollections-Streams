package javaclasses;

public class Q9 {
	private double balance;

    public Q9(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot deposit negative amount.");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
