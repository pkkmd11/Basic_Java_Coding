import java.util.Scanner;


public class volwel_find {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1;
int count;
Scanner input = new Scanner (System.in);
System.out.print("Enter a string");
str1=input.next();
count=vowel_count(str1);
System.out.print("Vowel no is"+count);
}
	
public static int vowel_count (String  s){
	int c=0;
	for(int i=0; i< s.length();i++){
		if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u'){
			c++;
		}
	}
	return c;
}
}
