import java.util.Scanner;


public class array3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,i;
		int arr[]=new int[10];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 10 integer");
		for ( i=0;i<=9;i++){
			arr[i]=input.nextInt();
			if(arr[i]%2==0){
				a++;
			}
			else{
				b++;
			}
		}
		System.out.println("no. of even in array is "+a);
		System.out.println("no. of odd in array is "+b);
	}

}
