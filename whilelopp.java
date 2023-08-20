import java.util.Scanner;


public class whilelopp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i=1,total=0;
Scanner input=new Scanner(System.in);
System.out.print("enter even number");
num=input.nextInt();
while(i<=5){
	
	while(num%2!=0)
	{
		System.out.print("Reenter");
		num=input.nextInt();
	}
	total=total+num;
	i++;
	System.out.print("even number");
	num=input.nextInt();
}
System.out.println("total is"+total);
System.out.print("Average is"+total/5);

}


}
