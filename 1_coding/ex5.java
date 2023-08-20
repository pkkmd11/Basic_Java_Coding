import java.util.Scanner;


public class ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y,i;
double in,am,interest;
Scanner input =new Scanner(System.in);
System.out.print("Enter initial amount:");
am=input.nextDouble();
System.out.print("Enter number of years:");
y=input.nextInt();
System.out.print("Enter interest rate(percent per year):");
interest=input.nextDouble();
for(i=1;i<=y;i++){
in=am*(interest/100);
am=am+in;
}


System.out.print("At the end of "+y+" years,you will have "+am+" dollars");

	}

}
