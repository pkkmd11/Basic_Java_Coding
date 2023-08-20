import java.util.Scanner;


public class exercise3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num,j = 0,k=0,l=0;
Scanner input =new Scanner(System.in);
System.out.print("Enter Ten number");
for(int i=0;i<10;i++){
	num= input.nextInt();
	if(num<0){
		j=j+1;
	
		}
	else if(num==0){
		k=k+1;
		
	}
	else if(num>0){
		l=l+1;
		
	}

	
}
System.out.println("Zero is "+k);
System.out.println("Negative is "+j);
System.out.println("Positive is "+l);
	}

}
