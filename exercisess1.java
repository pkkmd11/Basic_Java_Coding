import java.util.Scanner;


public class exercisess1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input =new Scanner (System.in);

int num1,a;
System.out.print("Input an integer");
num1=input.nextInt();
digit(num1);
	}


	private static void digit(int num1) {
		// TODO Auto-generated method stub
		int ans=0;
		ans=ans+(num1%10);
		num1=num1/10;

		do
		{
			ans=(num1%10)+ans;
			num1=num1/10;
		}
		while(num1/10!=0);
		System.out.print(ans);	
		}
	}








