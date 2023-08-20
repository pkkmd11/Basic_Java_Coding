import java.util.Scanner;


public class find_minmum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,num2,num3;
Scanner input=new Scanner (System.in);
System.out.print("Enter  number1");
num1=input.nextInt();
System.out.print("Enter  number2");
num2=input.nextInt();
System.out.print("Enter  number3");
num3=input.nextInt();
if(num1<num2)
{
	if(num1<num3){
		System.out.print("Number1 "+num1+"is minimum" );
}	
	else
		{System.out.print("Number3 "+num3+" is minimum" );}

}
else
{

	
	if(num2<num3){
		System.out.print("Number2 "+num2+" is minimum");
	}
	else{System.out.print("Number3 "+num3+" is minimum");}
}



	}
	}


