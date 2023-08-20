import java.util.Scanner;


public class exercisess_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str2;
String temp;
Scanner input = new Scanner(System.in);
System.out.print("The given string is:");
str2=input.nextLine();
strReverse(str2);
	}

	private static void strReverse(String s) {
		String[] each_word = s.split(" ");
		String revstr = " ";
		for(int i=0; i<each_word.length;i++){
			String word = each_word[i];
			String revword=" ";
			for(int j=word.length()-1;j>=0;j--){
				revword=revword+word.charAt(j);
			}
			System.out.print(revword+" ");
		}
		
	}

}
