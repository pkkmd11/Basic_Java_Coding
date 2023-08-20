import java.util.Scanner;


public class area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length,width,area;
Scanner input= new Scanner(System.in);
System.out.print("Enter length");
length=input.nextInt();
System.out.print("Enter Width");
width=input.nextInt();
area=length*width;
System.out.print("Area is" +area);
	}

}
