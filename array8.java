import java.util.Scanner;


public class array8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1,num2;
		int ne=0,p=0,po=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 integer");
		int arr1[]=new int [10];
		for(int i=0;i<10;i++){
			arr1[i]=input.nextInt();
		if(arr1[i]<0){
			ne++;
		}
		else{
			po++;
		}
		}
		num2=10-ne;
		
		int arr2[]=new int [num2];
		int arr3[]=new int [10-po];
		for (int j=0;j<10;j++){
			if(arr1[j]<0){
				arr2[p++]=arr1[j];
			}
		}
		int b=0;
		for(int k=0;k<10;k++){
			if(arr1[k]>=0){
				arr3[b++]=arr1[k];
			}
		}
		for(int i1=0;i1<arr2.length;i1++){
		System.out.println(arr2[i1]);
		}
		for(int l=0;l<arr3.length;l++){
			System.out.println(arr3[l]);
		}
		}
		}


