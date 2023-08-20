import java.util.Scanner;


public class exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1 ,num2 = 0,temp;
Scanner input = new Scanner (System.in);
int arr1[]=new int [10];
for (int i=0; i<10; i++ ){
	System.out.print("Ente integer");
	arr1[i]=input.nextInt();
}
System.out.print("Before Removing :");
for(int i=0; i<10; i++){
	System.out.print(arr1[i]+",");
}

System.out.print("\n"+"Enter Number to Remove:");
num1=input.nextInt();

int a=0;
for (int i=0; i<10; i++){
	if(arr1[i]==num1){
		a++;
	}
}
num2=10-a;
int b=0;
int arr2[]=new int [num2];
for (int i=0 ; i<arr1.length;i++){
   if(arr1[i]!=num1){
	   arr2[b++]=arr1[i];
   }
}
System.out.print("After Removing :");
for(int i=0; i<arr2.length; i++){
	System.out.print(arr2[i]+",");
}


	}

}
