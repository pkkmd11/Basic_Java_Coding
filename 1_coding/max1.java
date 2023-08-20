import java.util.Scanner;


public class max1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
Scanner input =new Scanner (System.in);
System.out.print("Enter Number1");
num1=input.nextInt();
System.out.print("Enter Number2");
num2=input.nextInt();
System.out.print("Enter Number3");
num3=input.nextInt();
if(num1>num2 && num1>num3){
System.out.print("Number1 "+num1+ "is maximum");
}
else { 
	if(num2>num3){

	System.out.print("Number2"+num2+"is maximum");}

else {System.out.print("Number3"+num3+"is maximum");}
}
}
}
