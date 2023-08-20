import java.util.Scanner;


public class primeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,i=2,y;
Scanner input =new Scanner(System.in);
System.out.print("Enter number");
num=input.nextInt();
if(num !=2 && num !=1){
		while(num%i !=0){
			i++;
			}

		if(num==i ){
			System.out.print("Prime");
		}
		else{
			System.out.print("not prime");
			}
	}
else if(num==1){
	System.out.print("not prime");
}
else{
	System.out.print("prime");
}
	
	}

}
