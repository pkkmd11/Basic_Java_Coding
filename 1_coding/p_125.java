package pk;

import java.util.Scanner;

public class p_125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanne (System.in);
System.out.println("Enter three points : ");
double x1 =input.nextDouble();
double x2 =input.nextDouble();
double y1 = input.nextDouble();
double y2 = input.nextDouble();
double x3 =input.nextDouble();
double y3 =input.nextDouble();

double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));

double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a )))
	}

}
