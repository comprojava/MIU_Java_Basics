package learning;

public class Account3 {
	// instance variable
	private String accountName;
	private String accountNumber;
	double balance;

	Account3(String accountName, String accountNumber, double bal) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		balance = bal;
	}

	// Setters and getters ---> encapsulation
	public void setAccountName(String name) {
		accountName = name;
	}

	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String toString() {
		return "Account Name: "+getAccountName()+"\n"
			 + "Account Number: "+getAccountNumber()+"\n"
			 + "Balance: "+getBalance();
	}
}
