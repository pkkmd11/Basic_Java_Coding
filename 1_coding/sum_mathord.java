import java.util.Scanner;


public class sum_mathord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3,sum;
Scanner input = new Scanner (System.in);
System.out.print("Enter number 1");
num1=input.nextInt();
System.out.print("Enter number 2");
num2=input.nextInt();
System.out.print("Enter number 3");
num3=input.nextInt();
sum = adding(num1,num2,num3);
System.out.print("Total is "+sum);
System.out.print("Average is"+sum/3);
	}
	public static int adding(int x,int y, int z){
		int ans;
		ans = x+y+z;
		return ans;
	}
}

