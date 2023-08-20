import java.util.Scanner;


public class find_Max_num {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
Scanner input = new Scanner(System.in);
System.out.print("Enter a Number1");
num1=input.nextInt();
System.out.print("Enter a Number2");
num2=input.nextInt();
System.out.print("Enter a Number3");
num3=input.nextInt();
if(num1>num2)
{
	if(num1>num3){
		System.out.print("Number1 is"+num1+" big" );
}	
	else
		{System.out.print("Number3 is"+num3 +"big");}

}
else
{

	
	if(num2>num3){
		System.out.print("Number2 is"+num2+" big");
	}
	else{System.out.print("Number3 is"+num3+" big");}
}



	}

}
