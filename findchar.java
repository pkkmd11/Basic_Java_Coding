import java.io.IOException;


public class findchar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
char a;
System.out.print("Enter a Character");
 a= (char)System.in.read();
 if(Character.isDigit(a))
	 System.out.println("Your Enter is Digit");
 
 else if(Character.isUpperCase(a))
	System.out.print("Your Character is Upper case");

else System.out.print("Your Character is lower case");
	}

}
