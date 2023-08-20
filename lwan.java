import java.util.Scanner;


public class lwan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sq,y,wd,l;
Scanner input =new Scanner(System.in);
System.out.print("Enter Your lawn length");
l= input.nextInt();
System.out.print("Enter Your lawn Width");
wd=input.nextInt();
sq=l*wd;

if(sq<400){
	System.out.println("weekly mowing fee is "+25);
	y=25*20;
	System.out.print("Seasonal fee is "+y);
}

if(sq>=400 && sq<600){
	System.out.println("weekly mowing fee is "+35);
	y=35*20;
	System.out.print("Seasonal fee is "+y);
}

if(sq>600){
	System.out.println("weekly mowing fee is "+50);
	y=50*20;
	System.out.print("Seasonal fee is "+y);
}
	}

}
