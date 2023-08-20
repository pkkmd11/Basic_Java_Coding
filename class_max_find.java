import java.util.Scanner;


public class class_max_find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3,search;
Scanner input = new Scanner(System.in);
System.out.print("Enter number 1");
num1=input.nextInt();
System.out.print("Enter number 2");
num2=input.nextInt();
System.out.print("Enter number 3");
num3=input.nextInt();
System.out.print("Find Maximum:1  / Find Minimum:2 =");
search =input.nextInt();
if(search == 1){
	max(num1,num2,num3);
}
else if(search == 2){
	min(num1,num2,num3);
}
else{
	System.out.print("Retry");
}
	}

	
	private static void min(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if(num1<num2 && num1<num3){
			System.out.print(num1+" is minimum");
		}
		else if(num2<num1 && num2<num3){
			System.out.print(num2 +" is minimum");
		}
		else{
			System.out.print(num3 +" is miniumum");
		}
	}

	private static void max(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if(num1 > num2 && num1>num3){
			System.out.print(num1+" is maximum");
		}
		else if(num2>num1 && num2>num3){
			System.out.print(num2+" is maximmu");
		}
		else {
			System.out.print(num3+" is maximum");
		}
		
		
	}

}
