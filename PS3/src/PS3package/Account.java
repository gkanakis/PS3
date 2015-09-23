//George Kanakis CISC 181-010
//Practice Set 3

package PS3package;

import java.util.Date;

import CISC181.Week3.Package4.InsufficientFundsException;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public myAccount();

	{
	}

	public int initial(id, balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public void getMonthlyInterestRate() {
		double MonthlyInterestRate = (annualIntererstRate / 12);
	}

	public double Withdraw(double amount) {
		balance = balance - amount;
		return balance;
	}

	public double Deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance = balance - amount; } 
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

}
