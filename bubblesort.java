import java.util.Scanner;


public class bubblesort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
Scanner input = new Scanner (System.in);
int arr1[]= new int [10];
for (int i=0; i<10; i++){
	System.out.print("Ente  integer");
	arr1[i]=input.nextInt();
	}
for(int j=0; j<9; j++){
for (int i=0; i<9-j ; i++){
	if(arr1[i]>arr1[i+1]){
		temp=arr1[i];
		arr1[i]=arr1[i+1];
		arr1[i+1]=temp;
	}
}
}
for(int y=0; y<10; y++){
	System.out.print(arr1[y]+",");
	}
}

}
