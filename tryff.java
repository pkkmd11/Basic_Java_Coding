package pk;

import java.util.Scanner;

public class tryff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = (int) (Math.random() * 100);
		int num2 = (int) (Math.random() * 100);
		int num3 = (int) (Math.random() * 100);
		if (num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if( num2<num3) {
			int temp =num2;
			num2 =num3;
			num3 =temp;
		}
		System.out.println("What is " + num1 + "-" + num2 + "-"+num3+"?");
		int ans = input.nextInt();
		if (ans == (num1 - num2-num3))
			System.out.println("You are correct ");
		else {
			System.out.println("your answer is wrong \n" + num1 + "-" + num2 +"-"+ num3+" is" + (num1 - num2-num3));
		}
	}
}
