import java.io.IOException;


public class threechar {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		char ch1,ch2,ch3;
		System.out.println("Please Enter a Character");
		ch1=(char)System.in.read();System.in.read();System.in.read();
		System.out.println("Please Enter Second Character");
		ch2=(char)System.in.read();System.in.read();System.in.read();
		System.out.println("Please Enter Third Character");
		ch3=(char)System.in.read();System.in.read();System.in.read();
		System.out.print("Your Enterd Characters is "+ch1+ch2+ch3);

	}

}
