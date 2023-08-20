import java.util.Scanner;


public class array5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,i,y;
		int arr[]=new int[10];
		int arr1[]=new int[10];
		int arr3[]=new int[10];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 10 integer");
		for ( i=0;i<=9;i++){
			arr[i]=input.nextInt();
		}
		System.out.print("Enter 10 integer");
		for(y=0;y<=9;y++){
			arr1[y]=input.nextInt();
		}
		
		
		for(int x=0;x<=9;x++){
			arr3[x]=arr[x]+arr1[x];
		
		}
		for(i=0;i<=9;i++){
			System.out.print(arr3[i]+",");
		}
		
		
		
	}

}
