import java.io.IOException;
import java.util.Scanner;


public class tshirt {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
char size;
int ts,cost;
Scanner input = new Scanner (System.in);
System.out.print("Amout of Tshirt");
ts=input.nextInt();
System.out.print("Choose Size L,M,S");
size= (char) System.in.read();
if(size == 'L')
	{
	cost = ts*6800;
	System.out.print("Cost is "+cost);
	}
else if(size == 'M')
	{
	cost= ts*6300;
	System.out.print("Cost is" +cost);
	}
else
	{
	
	cost = ts*6000;
	System.out.print("Cost is" +cost);
	}
	}

}
