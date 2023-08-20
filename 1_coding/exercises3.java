import java.util.Scanner;


public class exercises3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp;
Scanner input = new Scanner (System.in);

int arr[]=new int [8];
for(int i=0; i<8;i++){
	System.out.print("Enter Integer :");
	arr[i]=input.nextInt();
}
System.out.print("Array Element :");
for(int i=0; i<8;i++){
	System.out.print(arr[i]+",");
	
}

System.out.print("\n"+"Duplicate Values :");
for(int j=0; j<8-1; j++){
	temp = arr[j];
for (int i=j+1; i<8 ; i++){
	if(temp ==arr[i]){
		System.out.print(temp+",");
	}
}
}


	}

}
