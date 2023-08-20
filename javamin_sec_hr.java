import java.util.Scanner;


public class javamin_sec_hr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min,se,hr,ch;
Scanner input = new Scanner (System.in);
System.out.print("Input Minute");
min=input.nextInt();
System.out.print("Choose 1:Minute to hour  2:Minute to Second");
ch=input.nextInt();
if(ch == 1){
	minutetohour(min);
}
else if(ch ==2 ){
	minutetosecond(min);
}
else{
	System.out.print("Retry");
}
	}

	private static void minutetosecond(int min) {
		// TODO Auto-generated method stub
		System.out.print((min*60)+" Second");
	}

	private static void minutetohour(int min) {
		// TODO Auto-generated method stub
		System.out.print((min/60)+" hour");
	}



}
