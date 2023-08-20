package pk;

import java.util.Scanner;

public class ex_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds :");
		double p = input.nextDouble();
		System.out.println("Enter Feet :");
		double f = input.nextDouble();
		System.out.println("Enter inches :");
		double in = input.nextDouble();
		final double kilo_per_pound = 0.45359237;
		final double meter_per_inch = 0.0254;
		double height = f * 12;
		height = height + in;

		double weightinkiog = p * kilo_per_pound;
		double heightinmeter = height * meter_per_inch;
		double bmi = weightinkiog / (heightinmeter * heightinmeter);
		System.out.println("BMI is " + bmi);

		if (bmi < 18.5) {
			System.out.println("Underweight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi < 30) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obse");
		}

	}

}
