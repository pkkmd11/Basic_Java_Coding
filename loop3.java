import java.util.Scanner;


public class loop3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i;
Scanner input=new Scanner(System.in);
System.out.print("Enter a number");
num=input.nextInt();
for(i=1;i<=12;i++){
	System.out.println(i*num);
}
	}

}
