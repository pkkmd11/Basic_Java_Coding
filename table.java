import java.io.IOException;


public class table {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
char type,table;
System.out.print("Select Table Pine=P,Oak=O,Magogany=M\t:");
table=(char)System.in.read();System.in.read();System.in.read();
System.out.print("Select Size Small=S,Large=L\t:");
type=(char)System.in.read();System.in.read();System.in.read();
	if(table == 'P' && type == 'S'){
	System.out.print ("Price is 100$");}
	
	else if(table == 'P' && type == 'L'){
		System.out.print("Price is 135$");
	}
	else if(table == 'O' && type == 'S'){
		System.out.print("Price is 225$");
	}
	else if(table == 'O' && type == 'L'){
		System.out.print("Price is 260$");
	}
	else if(table == 'M' && type == 'S'){
		System.out.print("Price is 310$");
	}
	else if(table == 'M' && type == 'L'){
		System.out.print("Price is 345$");
	}
	else {
		System.out.print("INvalid");
	}

}
}
