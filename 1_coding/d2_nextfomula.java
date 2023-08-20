import java.util.Scanner;


public class d2_nextfomula {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String a,b,c,d,e,f,g,h,i;
Scanner input = new Scanner(System.in);
System.out.print("Enter first Number\t");
a=input.nextLine();
System.out.print("Enter Second Number\t");
b=input.nextLine();
System.out.print("Enter third Number\t");
c=input.nextLine();
System.out.print("Enter four Number\t");
d=input.nextLine();
System.out.print("Enter five Number\t");
e=input.nextLine();
System.out.print("Enter six Number\t");
f=input.nextLine();
System.out.print("Enter seven Number\t");
g=input.nextLine();
System.out.print("Enter eight Number\t");
h=input.nextLine();


System.out.println("Today Special Number is \n\n"
		+(b+g)+","+(c+d)
		+","+(b+c)+","+(b+d)
		+","+(g+c)+","+(g+d)
		+","+(c+d)+","+(c+e)
		);



	}

}
