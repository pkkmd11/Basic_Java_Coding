import java.util.Scanner;


public class sweppy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,temp;
Scanner input =new Scanner(System.in);
System.out.print("Enter number");
num1=input.nextInt();
System.out.print("Enter Second number");
num2=input.nextInt();
System.out.println("Before Sweepy\n num1 is"+num1+"\n, Num 2 is"+num2+"\n");
temp=num1;
num1=num2;
num2=temp;
System.out.println("After Sweepy\n num1 is"+num1+"\n, Num2 is "+num2);



	}

}
