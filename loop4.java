import java.util.Scanner;


public class loop4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

double num1,gallons=7.481;
Scanner input =new Scanner (System.in);
System.out.print("Enter A number of gallons ");
num1=input.nextDouble();
num1=num1/gallons;
System.out.print("Total cubic foot "+num1);

	}

}
