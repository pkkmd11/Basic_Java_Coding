import java.io.IOException;


public class vowel {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
char a;
System.out.print("Enter a character");
a=(char)System.in.read();
if(a== 'a' || a== 'e' || a=='i' || a=='o' || a=='u'){
	System.out.print("Your entered Character is Vowel");
	}
else {
	System.out.print("Your entered Character is not Vowel");
}
	}

}
