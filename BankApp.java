package bankdemo;
class SavingsAccount
{
	double balance;
	double interest;
	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}

	void withdraw(int amount) {

		balance=balance-amount;
	}

	void deposit(int amount) {

		balance=balance+amount;
	}

	public double getBalance() {
		double intr=balance * (interest/100);
		balance+=intr;
		return balance;
	}

}

public class BankApp {

	public static void main(String[] args) {
		SavingsAccount s1=new SavingsAccount(2000.00,4.0);
		s1.deposit(500);
		System.out.println(s1.getBalance());
		s1.withdraw(200);
		System.out.println(s1.getBalance());

	}

}