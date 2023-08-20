import java.util.Scanner;


public class exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1,y=0 ,res;
Scanner input = new Scanner (System.in );
System.out.print("Enter the length of the array");
num1=input.nextInt();
int arr[]= new int [num1];
for(int i=0 ;i<num1 ; i++){
	System.out.print("Enter interger");
	arr[i]=input.nextInt();
	}

for(int i=0; i<arr.length; i++){
	y= y+arr[i];
   }

res = y/num1;

System.out.println("Average Valure of the array"+res);
}

}
