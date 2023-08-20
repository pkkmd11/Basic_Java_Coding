package pk;

import java.util.Scanner;

public class study_3_1 {
	public static void main(String[] args) {
		// Input//
		Scanner input = new Scanner(System.in);
		System.out.println("(How Many Integer Do you input?)");
		System.out.print("Nang kam ai integer hpe gayet bang u :");
		int in = input.nextInt();
		//Input an integer for input//
		int arr[] = new int[in];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a integer for (" + (i + 1)  + ") Element :");
			arr[i] = input.nextInt();
		}
		
		// Output array for Input//
		System.out.println("\nYour Inputing Array is Here!");
		System.out.print("A ={");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("}");
		System.out.print("\n");
		int p = arr.length;

		// bubble sort //
		System.out.println("(Array's Length) =" + p);
		for (int i = 0; i < p - 1; i++) {
			System.out.print("\n" + "For (" + "i" + "=" + i + "; " + i + "<" + (p - 1) + ")");
			for (int j = 1; j < p - i; j++) {
				System.out.println("\n" + "For (" + "j" + "=" + j + "; " + j + "<" + (p - i) + " )");
				if (arr[j - 1] > arr[j]) {
					System.out.println("if" + "(" + arr[j - 1] + " > " + arr[j] + ")");
					int temp = arr[j - 1];
					System.out.println("temp" + " =" + arr[j - 1]);
					arr[j - 1] = arr[j];
					System.out.println("A[" + (j - 1) + "]" + " =" + arr[j]);
					arr[j] = temp;
					System.out.println("A[" + (j) + "]" + " =" + temp);
					System.out.print("A = {");
					for (int k = 0; k < arr.length; k++) {
						System.out.print(arr[k] + ",");
					}
					System.out.print("}");
					System.out.print("\n");
				}

				else {
					System.out.println("if(" + arr[j - 1] + ">" + arr[j] + ")");
					System.out.print("A = {");
					for (int y = 0; y < arr.length; y++) {
						System.out.print(arr[y] + ",");
					}
					System.out.print("}");
					System.out.print("\n");
				}
			}
		}

		// final Output//
		System.out.println("\n");
		System.out.println("Done! Here is Ascending Array.It is Changed with Bubblesort Algorithm*_*");
		System.out.print(" A ={");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.print("}");
	}

}
