package pk;

import java.util.Scanner;

public class Math {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter How many Summation :");
		int sum=input.nextInt();
		System.out.print("Enter first word:");
		String s =input.next();
		System.out.print("Enter Second word:");
		String s1=input.next();
		if(s1=="n") {
		for(int i=1; i<=sum; i++) {
			System.out.print(s+i+"+");
		}}
		else {
			for(int j=1; j<=sum; j++) {
				System.out.print(s+j+s1+j+"+");
			}
		}
	}

}
