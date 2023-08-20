import java.io.IOException;
public class vowel_1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
char ch;
System.out.print("Enter a Character ");
ch= (char) System.in.read();
switch (ch){
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.print("Vowel");
break;
default:System.out.print("not Vowel");
}
	}

}
