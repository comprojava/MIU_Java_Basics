package learning;
//getters and setters
public class Account2 {
	// instance variable
		private String accountName;
		private String accountNumber;
		double balance;
	
		Account2(String accountName, String accountNumber, double bal) {
			this.accountName = accountName;
			this.accountNumber = accountNumber;
			balance = bal;
		}
		
		//Setters and getters ---> encapsulation
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
}
