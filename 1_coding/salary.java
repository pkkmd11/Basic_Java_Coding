import java.util.Scanner;


public class salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int wday,pay,a;
double tax,b;
Scanner input=new Scanner(System.in);
System.out.print("Enter work day");
wday=input.nextInt();
System.out.print("Enter pay");
pay=input.nextInt();
System.out.print("Enter tax");
tax=input.nextInt();
a=wday*pay;
tax=tax/100;
tax=a*tax;
b=a-tax;

System.out.println("Salary is= " +a);
System.out.println("Tax is=" +tax);
System.out.println("Net Salary is=" +b );


	}

}
