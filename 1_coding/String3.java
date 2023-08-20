
public class String3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word1="HOME";
String word2="HONE";
int res;
res=word1.compareTo(word2);
if (res<0)System.out.print("Word 1 is less than word2");
else if (res>0)System.out.print("Word 1 is greater than word2");
else System.out.print("Word 1 is equal to word2");
	
	}

}
