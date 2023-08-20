package pk;

import java.util.Scanner;

public class ex_2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		float kilo = input.nextFloat();
		System.out.print("Enter the initial temperature: ");
		float temp = input.nextFloat();
		System.out.print("Enter the final temperature");
		float tempf = input.nextFloat();
		System.out.println("The energy needed is " + (kilo * (tempf - temp) * 4184));
	}

}
