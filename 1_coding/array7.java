import java.util.Scanner;


public class array7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 = 0,num2 = 0;
int zero = 0;
Scanner input =new Scanner (System.in);
System.out.print("Enter 10 arrays");
int arr[]=new int [10];
for(int i=0;i<10;i++){
	arr[i]=input.nextInt();
	if(arr[i]==0){
		zero++;
	}
}
num2= 10-zero;

int arr1[]=new int [num2];
int j=0;
for(int i=0;i<10;i++){
	if(arr[i]!=0){

		arr1[j++]=arr[i];
		
	}		
}
for(int y=0;y<arr1.length;y++){
	System.out.print(arr1[y]+",");}
	}

}
