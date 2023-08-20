import java.util.Scanner;


public class increment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x,y;
Scanner input=new Scanner(System.in);
System.out.print("Enter number");
x =input.nextInt();
y=x;
System.out.print("Increment of x :"+ ++x);
System.out.print("Increment of y :"+ y++);
	}

}
