import java.util.Scanner;


public class find_middle {

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
middle(str1);


	}
	

	private static void middle(String s) {
		int position,leng;
		if(s.length()%2 == 0){
		leng =2;
		position=s.length()/2-1;
		}
		else{
			leng =1;
			position = s.length()/2;
		}
		System.out.print (s.substring(position,position+leng));
	}

}
