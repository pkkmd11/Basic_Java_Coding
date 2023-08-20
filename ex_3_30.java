package pk;

import java.util.Scanner;

public class ex_3_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println("What is " + num1 + "-" + num2 + "?");
		int ans = input.nextInt();
		if (ans == (num1-num2))
			System.out.println("You are correct ");
		else {
			System.out.println("your answer is wrong \n" + num1 + "-" + num2 + " is" + (num1 - num2));
		}
	}

}
