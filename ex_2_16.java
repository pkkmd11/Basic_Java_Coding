package pk;

import java.util.Scanner;

public class ex_2_16 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the length of the side : ");
		float length=input.nextFloat();
		float ans = (float) ((3*(Math.sqrt(3))/2)*(Math.pow(length, 2)));
		System.out.println("The area of the haxagon is "+String.format("%.4f",ans));
	}
}
