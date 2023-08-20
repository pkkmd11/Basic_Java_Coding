import java.util.Scanner;


public class exercisess54 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,i;
		int arr[]=new int[7];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 7 integer");
		for ( i=0;i<7;i++){
			arr[i]=input.nextInt();
			if(arr[i]%2==0){
				a++;
			}
			else{
				b++;
			}
		}
		System.out.print("Array element :");
		for(int y=0 ; y<arr.length; y++){
			System.out.print(arr[y]+",");
		}
		
		System.out.println("\n"+"Odd: "+b);
		System.out.println("Even:"+a);
	}

}
