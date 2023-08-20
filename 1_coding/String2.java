import java.util.Scanner;


public class String2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a,b,c,d;
Scanner input =new Scanner (System.in);
System.out.print("Enter Upper word");
a=input.next();
System.out.print("Enter Lower word");
b=input.next();

c=a.toLowerCase();
d=b.toUpperCase();

System.out.println("Upper to lower "+c);
System.out.println("lower to Upper "+d);

	}

}
