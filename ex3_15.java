package pk;

import java.util.Scanner;

public class ex3_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lott = (int) (Math.random() * 1000);
		System.out.println("Enter your Lottery Number (Three Digit) :");
		int guess = input.nextInt();
		int lot1 = lott / 100;
		int lot2 = (lott / 10) % 10;
		int lot3 = lott % 10;
		int gus1 = guess / 100;
		int gus2 = (guess / 10) % 10;
		int gus3 = guess % 10;
		System.out.println("Lottery Number is " + lott);
		if (guess == lott) {
			System.out.println("Exact Match : You Win $10000");
		} else if (gus3 == lot3 && gus2 == lot2 && gus3 == lot3) {
			System.out.println("Match all digit : You Win $3000");
		} else if (gus1 == lot1 || gus1 == lot2 || gus1 == lot3 || gus2 == lot1 || gus2 == lot2 || gus2 == lot3
				|| gus3 == lot1 || gus3 == lot2 || gus3 == lot3) {
			System.out.println("Match One Digit : You Win $1000");
		} else {
			System.out.println("sorry not match");
		}
	}

}
