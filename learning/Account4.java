package learning;
//using array and static
public class Account4 {
	// instance variable
		private String accountName;
		private String accountNumber;
		double balance;
		static int numberOfAccounts = 0;
		private static String bankName;

		Account4(String accountName, String accountNumber, double bal) {
			this.accountName = accountName;
			this.accountNumber = accountNumber;
			balance = bal;
			numberOfAccounts++;
		}

		// Setters and getters ---> encapsulation

		public String getAccountName() {
			return accountName;
		}

		public String getAccountNumber() {
			return accountNumber;
		}

		public double getBalance() {
			return this.balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public static String getBankName() {
			return bankName;
		}

		public static void setBankName(String bankName) {
			Account4.bankName = bankName;
		}

		public String toString() {
			return "Account Name: "+getAccountName()+"\n"
				 + "Account Number: "+getAccountNumber()+"\n"
				 + "Balance: "+getBalance();
		}

}
