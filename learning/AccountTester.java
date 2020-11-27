package learning;

import java.util.Scanner;

public class AccountTester {

	public static void main(String[] args) {
		
		Account acc1 = new Account();
		
		System.out.println("Account Name: "+acc1.accountName);
		System.out.println("Account Number: "+acc1.accountNumber);
		System.out.println("Account Balance: "+acc1.balance);
		System.out.println("second object:");
		System.out.println("------------------");
		Account acc2 = new Account("Eunice", "889-8989", 40000);
		System.out.println("Account Name: "+acc2.accountName);
		System.out.println("Account Number: "+acc2.accountNumber);
		System.out.println("Account Balance: "+acc2.balance);
		System.out.println("------------------");
		
		//using user's inputs
		Scanner input = new Scanner(System.in);
		
		
	}

}
