    package pk;

public class a {

		public static void main(String[] args) {
			int[] A = { 8, 12, 15, 13, 9 };
			int a = A.length;
			System.out.println(a);
			for (int i = 1; i < A.length; i++){
				System.out.println("for ( i ="+i+";"+i +"<"+A.length+")");
			int temp = A[i];
			System.out.println("Temp ="+temp);
				int j = i;
				System.out.println("j ="+j);
				while (j > 0 && A[j - 1] > temp) {
					System.out.println("While ( j="+j+"> 0 && "+A[j-1]+">"+temp+")");
					A[j] = A[j - 1];
					System.out.println("A["+j+"]= "+A[j-1]);
					j--;
					
					for(int k=0; k<A.length;k++) {
						System.out.print(A[k]+",");
					}
				}
				System.out.println("\n");

				A[j] = temp;
				System.out.println("A["+j+"]= "+A[j]);
				for(int k=0; k<A.length;k++) { 
					System.out.print(A[k]+",");
				}
				
			}
			System.out.println("\n");
			for (int i = 0; i < A.length; i++) {
				System.out.print(A[i] + ",");
			}
		

	}

}
