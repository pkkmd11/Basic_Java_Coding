import java.util.Scanner;


public class do_while_loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner input=new Scanner (System.in);
System.out.print("Enter number");
num=input.nextInt();
while(num<=0 || num>=10){
	System.out.print("Reinter number");
	num=input.nextInt();
}
System.out.print("Accept YOur number is "+num);
	}

}
