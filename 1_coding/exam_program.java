import java.util.Scanner;


public class exam_program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int eng,mya,math;
Scanner input= new Scanner(System.in);
System.out.print("Enter English mark");
eng=input.nextInt();
System.out.print("Enter Myanmar mark");
mya=input.nextInt();
System.out.print("Enter Math mark");
math=input.nextInt();

if(eng <40){
	System.out.print("fail");
	
}

else if(mya<40){System.out.print("Fail");
	}
else if(math<40){System.out.print("Fail");
}
else{System.out.print("Pass");
	}
}
}
