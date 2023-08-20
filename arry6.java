import java.util.Scanner;


public class arry6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
// TODO Auto-generated method stub



int num1;
int num2;

Scanner input = new Scanner (System.in);

System.out.print("number of  index arr1");
num1=input.nextInt();
int arr1[] = new int [num1];
for(int i=0;i<num1;i++){
	System.out.print("enter integer");
	 arr1[i]= input.nextInt();
}

System.out.print("number of index arr2");
num2=input.nextInt();
int arr2[] = new int [num2];
for(int i=0;i<num2;i++){
	System.out.print("enter integer");
	arr2[i]=input.nextInt();
}
int arr3[] = new int [arr1.length+arr2.length];
for(int i=0;i<arr1.length;i++){
	arr3[i]=arr1[i];

}
int x=arr1.length;
for(int i=0;i<arr2.length;i++){
	
	arr3[x]=arr2[i];
	x++;
}
for(int i=0;i<arr3.length;i++){
	System.out.print(arr3[i]);
}



	
	}
}
