import java.util.Scanner;


public class exercise5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int fa,num,fn=1;
Scanner input =new Scanner (System.in);
System.out.print("Enter a Number");
num=input.nextInt();

for(int i=1;i<=num;i++){
	fn *= i;
}
System.out.print("Factorial value is "+fn);
	}

}
