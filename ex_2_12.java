package pk;

import java.util.Scanner;

public class ex_2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration : ");
		float speed = input.nextInt();
		float accel = input.nextFloat();
		float length = (float) ((Math.pow(speed, 2)) / (2 * accel));
		System.out.println("The minimum runway length for this airplane is " 
		+ String.format("%.3f", length));
	}

}
