import java.util.Scanner;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int test1,test2;
Scanner input= new Scanner (System.in);
System.out.print("Enter Test 1 Mark");
test1=input.nextInt();
System.out.print("Enter Test 2 Mark");
test2=input.nextInt();
if(test1>=20)
{
	if(test2>=30)
	{System.out.print("pass");}
	else
	{System.out.print("Retry");}
}
else
{System.out.print("Retry");}

}
}
