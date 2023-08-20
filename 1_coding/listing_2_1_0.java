package pk;

import java.util.Scanner;

public class listing_2_1_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount in double for example 11.56 :");
		double amount = input.nextDouble();
		int remainingamout = (int) (amount * 100);
		int numberofonedollars = remainingamout % 100;
		int numberofquarters = remainingamout / 25;
		remainingamout = remainingamout % 25;
		int numberofdimes = remainingamout / 10;
		remainingamout = remainingamout % 10;
		int numberofnickels = remainingamout / 5;
		remainingamout = remainingamout % 5;
		int numberofpennies = remainingamout;

		System.out.println("Your amount " + amount + "consists of");
		System.out.println(" " + numberofonedollars + "dollars");
		System.out.println(" " + numberofquarters + "quarters");
		System.out.println(" " + numberofdimes + "dimes");
		System.out.println(" " + numberofnickels + "nickels");
		System.out.println(" " + numberofpennies + "pennies");
	}

}
