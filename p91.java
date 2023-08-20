package pk;

import java.util.Scanner;

public class p91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner (System.in);
System.out.print("Enter weight in pounds ");
double weight = input.nextDouble();
System.out.print("Enter geight in inches: ");
double height = input.nextDouble();
final double K_P_P = 0.45359237;
final double M_P_P = 0.0254;
double weightkio = weight * K_P_P;
double heightmeter = height * M_P_P;
double bmi = weightkio / (heightmeter * heightmeter);
System.out.println("BMI is "+bmi);
if (bmi<18.5) System.out.println("Underweight");
else if (bmi<25) System.out.println("Normal");
else if (bmi<30) System.out.println("Oberweight");
else System.out.println("Obese");
	}

}
