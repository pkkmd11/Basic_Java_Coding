import java.util.Scanner;


public class even_odd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner input =new Scanner(System.in);
System.out.print("Enter the number");
num=input.nextInt();

if(num%2 == 0)
	System.out.print("even");
	

else System.out.print("Odd");
	}
}


