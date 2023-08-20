package pk;

import java.util.Scanner;

public class ex3_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		int num = input.nextInt();
		int num1 = num % 5;
		int num2 = num % 6;
		System.out.println("Is 10 divisible by 5 and 6? " + (num1 == 0 && num2 == 0));
		System.out.println("Is 10 divisible by 5 and 6? " + (num1 == 0 || num2 == 0));
		System.out.println("Is 10 divisible by 5 and 6.but not both? " + (num1 == 0 ^ num2 == 0));
	}

}
