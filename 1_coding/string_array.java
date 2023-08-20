
public class string_array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str= {"Kim","Ken","Tom","Kathy","Brad"};
String temp;
for(int j=0 ; j<str.length-1;j++){
for(int i=0; i<str.length-(1-j);i++){
	if(str[i].compareTo(str[i+1])>0){
		temp = str[i];
		str[i]=str[i+1];
		str[i+1]=temp;
	}
}
}
for(int i=0; i<str.length;i++){
	System.out.print(str[i]+" ");
}
	}

}
