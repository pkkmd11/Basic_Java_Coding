import java.util.Scanner;


public class shop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3,total;
Scanner input =new Scanner(System.in);
System.out.print("Amount of L Size");
num1=input.nextInt();
System.out.print("Amount of M Size");
num2=input.nextInt();
System.out.print("Amount of S Size");
num3=input.nextInt();
num1=num1*6800;
num2=num2*6300;
num3=num3*6000;
total=num1+num2+num3;
System.out.println("L Size cost=\t"+num1);
System.out.println("M Size cost=\t"+num2);
System.out.println("S Size cost=\t"+num3);
System.out.println("Total cost =\t"+total);
	}

}
