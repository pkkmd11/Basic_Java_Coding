import java.util.Scanner;


public class math {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,oper;
Scanner input =new Scanner(System.in);
System.out.print("First");
num1=input.nextInt();
System.out.print("Second");
num2=input.nextInt();
System.out.print("Chooes 1:Sum ,2:Divided, 3:Multiply 4:Average");
oper=input.nextInt();
if(oper == 1){
	adding(num1,num2);
	}
	else if (oper ==2){
		divided(num1,num2);
	}
	else if (oper ==3 ){
		multi(num1,num2);
	}
	else if(oper == 4){
		average(num1,num2);
	}
	else {
		System.out.print("Retry");
	}


	}

	private static void average(int num1, int num2) {
		System.out.print("Total is "+ ((num1+num2)/2));
	}

	private static void multi(int num1, int num2) {
		System.out.print("Total is " + (num1* num2));
	}

	private static void divided(int num1, int num2) {
		System.out.print("Total is "+(num1-num2));
	}

	private static void adding(int num1, int num2) {
		System.out.print("Total is "+ (num1+num2));
	}

}
