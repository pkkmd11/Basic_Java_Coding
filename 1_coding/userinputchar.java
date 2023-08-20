import java.io.IOException;


public class userinputchar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		
		char ch;
		int i;
		System.out.println("Enter one character");
		ch=(char)System.in.read();
		System.out.println("The character your enter is "+ch);
		i=(int)ch;
		System.out.print("the integer value for character is "+i);
		

	}

}
