import java.io.IOException;
import java.util.Scanner;


public class Switch2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String month1;
Scanner input =new Scanner (System.in);
System.out.println("January=1,February=2,march=3,April=4,May=5,June=6,July=7,\nAugust=8,September=9,October=10,November=11,December=12");
System.out.print("Choose Month :");
month1=input.nextLine();
switch (month1){
case "April":System.out.print("This month have 30 days");
break;
case "September":System.out.print("This month have 30 days");
break;
case "June":System.out.print("This month have 30 days");
break;
case "November":System.out.print("This month have 30 days");
break;
case "February": System.out.print("This month have 28 days");
break;
default :System.out.print("This month have 31 days");
}
	}

}
