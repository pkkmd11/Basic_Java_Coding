import java.util.Scanner;



public class PayrollwithTax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int hp,hw,gp;
double tax;
Scanner input = new Scanner (System.in);
System.out.print("hour pay");
hp=input.nextInt();
System.out.print("work hour");
hw=input.nextInt();
gp=hp*hw;
System.out.println("gross pay  ="+gp+"$");
if(gp<=300){
	tax = 0.1;
	tax=gp*tax;
	gp= (int) (gp-tax);
	System.out.println("Pay tax  ="+tax+"$");
	System.out.println("netpay ="+gp+"$");
}
else if(gp>=300.01 && gp<=400){
	tax = 0.12;
	tax=gp*tax;
	gp= (int) (gp-tax);
	System.out.println("Pay tax  ="+tax+"$");
	System.out.println("netpay ="+gp+"$");
}
else if(gp>=400.01 && gp<=500){
	tax = 0.15;
	tax=gp*tax;
	gp= (int) (gp-tax);
	System.out.println("Pay tax  ="+tax+"$");
	System.out.println("netpay ="+gp+"$");
}
else if(gp>=500.01){
	tax = 0.20;
	tax=gp*tax;
	gp= (int) (gp-tax);
	System.out.println("Pay tax  ="+tax+"$");
	System.out.println("netpay ="+gp+"$");
}

	}

}
