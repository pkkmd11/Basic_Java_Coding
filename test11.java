import java.util.Scanner;


public class test11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int test1;
Scanner input=new Scanner (System.in);
System.out.print("Enter test 1's score");
test1= input.nextInt();
switch (test1){
case  80:System.out.print("Pass with d");
break;
case  60:System.out.print("pass");
break;
default : System.out.print("Fail");

}
	}

}
