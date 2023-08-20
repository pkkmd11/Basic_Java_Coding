import java.util.Scanner;


public class array4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,i,max;
		int arr[]=new int[10];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter 10 integer");
		for ( i=0;i<=9;i++){
			arr[i]=input.nextInt();

	}
		max=arr[0];
		for(i=1;i<=9;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.print("Max is "+max);

}
}