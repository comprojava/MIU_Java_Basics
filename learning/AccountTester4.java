package learning;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class AccountTester4 {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter number of accounts/objects");
		Scanner input = new Scanner(System.in);
		DataInputStream ds = new DataInputStream(System.in);
		int n = input.nextInt();
		Account4[] acc = new Account4[n];
		System.out.println("entering objects data");
		String name, number;
		double b;
		for (int i = 0; i < n; i++) {
			System.out.println("Entering data for account " + (i + 1));
			System.out.println("----------------");
			System.out.println("Enter account name: ");
			//input.hasNext();
			name = ds.readLine();
			//name = input.nextLine();
			
			System.out.println("Enter account Number: ");
			//input.hasNext();
			number = ds.readLine();
			//number = input.nextLine();
			
			System.out.println("Enter account Balance: ");
			//input.hasNextDouble();
			b=Double.parseDouble(ds.readLine());
			
			//b = input.nextDouble();

			acc[i] = new Account4(name, number, b);
		}
		System.out.println("displaying all info: ");
		for (int i = 0; i < acc.length; i++) {
			System.out.println(acc[i]);
			System.out.println();
		}
		System.out.println(Account4.numberOfAccounts + " accounts in " + Account4.getBankName() + " bank");

	}

}
