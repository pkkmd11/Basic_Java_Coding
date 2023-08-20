import java.util.Scanner;


public class threedigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,a,b,c;
Scanner input=new Scanner(System.in);
System.out.print("Enter 3 digit");
num=input.nextInt();
c=num%10;
b=num/100;
a=num%100;
a=a/10;

System.out.println("First digit is ="+b);
System.out.println("Second digit is=" +a);
System.out.println("Third digit is =" +c);
	}

}
