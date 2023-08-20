import java.io.IOException;


public class small_to_Upper_Case {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		char ch;
		int i;
		System.out.println("Enter Small character");
		ch=(char)System.in.read();
		i=(int)ch;
		i=i-32;
		ch=(char)i;
		System.out.println("Upper Case is "+ ch);
	}

}
