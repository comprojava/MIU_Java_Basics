package learning;

import java.util.Scanner;

public class AccountTester2 {
	public static void main(String[] args) {

		Account2 acc2 = new Account2("Henry", "111-909", 2000000);

		System.out.println("Account Name: " + acc2.getAccountName());
		System.out.println("Account Number: " + acc2.getAccountNumber());
		System.out.println("Account Balance: " + acc2.balance);
		//System.out.println("second object:");
		System.out.println();
		System.out.println("Changing account name:");
		System.out.println("------------");
		acc2.setAccountName("Gedeon");
		
		System.out.println("Account Name: " + acc2.getAccountName());
		System.out.println("Account Number: " + acc2.getAccountNumber());
		System.out.println("Account Balance: " + acc2.balance);

		// using user's inputs
		Scanner input = new Scanner(System.in);
	}
}
