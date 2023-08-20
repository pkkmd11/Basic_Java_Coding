import java.util.Scanner;


public class do_while_loop_noteven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner input=new Scanner (System.in);
System.out.print("Enter Even Number");
num=input.nextInt();
while((num%2)!=0){
	System.out.print("Reinter Even Number");
	num=input.nextInt();
}
System.out.print("YOur enter number is even"+num);
	}

}
