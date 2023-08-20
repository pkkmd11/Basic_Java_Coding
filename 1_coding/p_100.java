package pk;

import java.util.Scanner;

public class p_100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lotttery = (int) (Math.random() * 100);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits):");
		int guess = input.nextInt();
		int lottery1 = lotttery / 10;
		int lottery2 = lotttery % 10;
		int guess1 = guess / 10;
		int guess2 = guess % 10;
		System.out.println("The Lottery number is " + lotttery);
		if (guess == lotttery)
			System.out.println("Exact match : you win $10000");
		else if (guess2 == lottery1 && guess1 == lottery2)
			System.out.println("Match all digit: you win $3000");
		else if (guess1 == lottery1 || guess1 == lottery2 || guess2 == lottery1 || guess2 == lottery2)
			System.out.println("Match one digit : you win $1000");
		else System.out.println("Try Again, Good Luck next time");
		System.out.println(10/5);
	}

}
