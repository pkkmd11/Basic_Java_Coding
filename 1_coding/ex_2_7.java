package pk;

import java.util.Scanner;

public class ex_2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes:  ");
		int num1 = input.nextInt();
		int hour = num1 / 60;
		int day = hour / 24;
		System.out.println(num1 + " minutes is approximately " 
		+ (day / 365) + " years and " + (day % 365) + " days");

	}

}
