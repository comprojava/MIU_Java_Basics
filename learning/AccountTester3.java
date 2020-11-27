package learning;

import java.util.Scanner;

public class AccountTester3 {

	public static void main(String[] args) {
		String name = "jack";
		Account3 acc3 = new Account3(name, "111-909", 2000000);
	
		
		System.out.println(acc3);
		System.out.println();
		
		System.out.println("Changing the Name:");
		acc3.setAccountName("Divine");
		
		System.out.println(acc3);
		
		//acc3.accountName = "pascal";
		
		
	}
}
