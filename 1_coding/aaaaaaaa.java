import java.util.Scanner;


public class aaaaaaaa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i=0,a;
Scanner input=new Scanner(System.in);
System.out.print("Enter Number");
num=input.nextInt();
while (num>100){
	System.out.print("Reenter");
	num=input.nextInt();
}

while(num>0 && num<100 && i<100 ){
	i++; 
	a=i*num;
	if (a<=100){
	System.out.println(a);}
	

}


	}

}
