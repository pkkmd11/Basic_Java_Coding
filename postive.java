import java.util.Scanner;


public class postive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner input=new Scanner(System.in);

System.out.print("Enter a number");
num=input.nextInt();
if(num<0){
	System.out.print("Your Enter number is negative");
}
else if(num==0){
	System.out.print("Your Enter number is Zero");
}
else{
	System.out.print("Your Enter numner is positive");
}
	}

}
