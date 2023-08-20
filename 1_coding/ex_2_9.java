package pk;

import java.util.Scanner;

public class ex_2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter V0, V1, and t : ");
		float v0 = input.nextFloat();
		float v1 = input.nextFloat();
		float t = input.nextFloat();
		System.out.print("The average accelaration is "+ String.format("%.4f",((v1 - v0) / t)));

	}

}
