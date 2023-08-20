package pk;

import java.util.Scanner;

public class p_3_26_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		int num3 = (int) (Math.random() * 100);
		System.out.println("What is " + num1 + "+" + num2 + "+" + num3 + " ?");
		int ans = input.nextInt();
		if (ans == (num1 + num2 + num3)) {
			System.out.println("Your answer is correct :");
		} else {
			System.out.println("Sorry , your answer is wrong \n The correct answer is "
		+num1+"+"+num2+"+"+num3+"="+ (num1 + num2 + num3));
		}
	}
}
