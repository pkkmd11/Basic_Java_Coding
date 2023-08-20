import java.util.Scanner;


public class ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
double bt=1.487, f=0.172, g=0.584, j=0.00955,in;
Scanner input=new Scanner (System.in);
System.out.print("Enter amount dollars");
in=input.nextDouble();
System.out.println("Dollor to british pound= "+in/bt);
System.out.println("Dollor to French= "+in/f);
System.out.println("Dollor to german= "+in/g);
System.out.println("Dollor to japanese= "+in/j);


	}

}
