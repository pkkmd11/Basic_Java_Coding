import java.util.Scanner;


public class exam_program1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int eng,mya,math;
Scanner input=new Scanner(System.in);
System.out.print("Enter Eng mark");
eng=input.nextInt();
System.out.print("Enter mya mark");
mya=input.nextInt();
System.out.print("Enter math mark");
math=input.nextInt();
if(eng>=40)
{
	if(mya>=40){
		if(math>=40){
			System.out.print("Pass");
		}
		else{System.out.print("Fail");}
	}
	else {System.out.print("Fail");}
}
else {System.out.print("Fail");}
	}

}
