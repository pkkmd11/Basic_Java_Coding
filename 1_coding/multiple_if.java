import java.util.Scanner;


public class multiple_if {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner input=new Scanner(System.in);
System.out.print("Enter number" );
num=input.nextInt();
if(num>=100){
	System.out.print("Excellent");
}
else if(num>=80){
	System.out.print("Good");
}
else if(num>=50){
	System.out.print("Average");
}
else{
	System.out.print("Poor");
}


	}

}
