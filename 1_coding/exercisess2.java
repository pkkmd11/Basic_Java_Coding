import java.util.Scanner;


public class exercisess2 {

	public static final int PASSWORD_LENGTH = 8;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.print("1.A Password must have at least ten characters\n"+
"2.A password consists of only letters and digits\n"+
"3.A passowrd must contain at least two digits.");
System.out.println("\nInput a password (Your are agreeing to the above Terms and Conditions.):");
String s = input.next();
if(is_Volid_Password(s)){
	System.out.print("password is valid:"+s);
}
else{
	System.out.print("Not a valid password:"+s);
}
	}
	private static boolean is_Volid_Password(String password) {
		// TODO Auto-generated method stub
		if(password.length()<PASSWORD_LENGTH)
		return false;
		int charCount=0;
		int numCount=0;
		for(int i=0; i<password.length();i++){
			char ch=password.charAt(i);
			if(is_Numeric(ch))numCount++;
			else if(is_Latter(ch))charCount++;
			else return false;
		}
		return (charCount>=2 && numCount>=2);
	}
	private static boolean is_Numeric(char ch) {
		// TODO Auto-generated method stub
		return (ch>='0' && ch<='9');
	}
	private static boolean is_Latter(char ch) {
		// TODO Auto-generated method stub
		ch=Character.toUpperCase(ch);
		return(ch>='A' && ch<='Z');
		
	}

}
