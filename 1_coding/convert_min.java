import java.util.Scanner;


public class convert_min {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hr,min;
		Scanner input= new Scanner(System.in);
		System.out.print("Enter min");
		min=input.nextInt();
		hr=min/60;
		min=min%60;
		System.out.println("Hour is:" +hr +"hour");
		System.out.println("Minute is:" +min +"minute");
	}

}
