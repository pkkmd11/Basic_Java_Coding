import java.util.Scanner;


public class even_oddd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,even=0,odd=0;
Scanner input = new Scanner (System.in);
System.out.print("Enter 10 number");
for(int i=1;i<=10;i++){
num=input.nextInt();
if(num%2==0){
	even=even+1;
}
else if(num%2!=0){
	odd=odd+1;
}
}
System.out.print("Even"+even+"\n Odd"+odd);

}

}
