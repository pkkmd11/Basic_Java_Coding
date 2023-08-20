import java.util.Scanner;


public class array2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c,i;
int arr[]=new int[10];
Scanner input = new Scanner (System.in);
System.out.print("Enter 10 integer");
for ( i=0;i<=9;i++){
	arr[i]=input.nextInt();
}

System.out.println("Number");
for(i=0;i<=9;i++){
	System.out.print(arr[i]+","+"\n");
}
System.out.println("Searh");
a=input.nextInt();
System.out.println("Index "+a+"is "+arr[a]);



	}

}
