package learning;

public class Account {
	// instance variable
	String accountName;
	String accountNumber;
	double balance;
	
	Account() {
		this.accountName = "Pascal";
		this.accountNumber = "Unkown";
		balance = 5;
	}
	// parameterized constructor
	Account(String accountName, String accountNumber, double bal) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		balance = bal;
	}	
	
		
}
