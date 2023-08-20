import java.util.Scanner;


public class ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dc,fc;
Scanner input = new Scanner(System.in);
System.out.print("Enter Degree Celsius");
dc=input.nextInt();
fc=(dc*9/5)+32;
System.out.print(+fc+" Degree fahrenheit");
	
	}

}
