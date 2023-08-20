package pk;

public class study_3 {

	public static void main(String[] args) {
		int arr[] = { 30,52,29,87,63 };
		int p = arr.length - 1;
		for (int i = 0; i < p; i++) {
			System.out.print("\n"+"For (" + "i" + "=" + i + ";" + i + "<" + p + ")");
			for (int j = 0; j < p - i; j++) {
				System.out.println("\n" + "For (" + "j" + " =" + j + " ;" + j + "<" + (p - i) + " )");
				if (arr[j] > arr[j + 1]) {
					System.out.println("if" + "(" + arr[j] + " > " + arr[j + 1] + ")");
					int temp = arr[j];
					System.out.println("temp" + " =" + arr[j]);
					arr[j] = arr[j + 1];
					System.out.println("arr[" + j + "]" + " =" + arr[j + 1]);
					arr[j + 1] = temp;
					System.out.println("arr[" + (j + 1) + "]" + " =" + temp);
					for (int k = 0; k < arr.length; k++) {
						System.out.print(arr[k] + ",");
					}
					System.out.print("\n");
				}
				
				else {
					System.out.println("if("+arr[j]+"<"+arr[j+1]+")");
					for(int y=0;y<arr.length;y++) {
						System.out.print(arr[y]+",");
					}
					System.out.print("\n");
				}
			}
		}

	}

}
