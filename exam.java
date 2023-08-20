import java.util.Scanner;


public class exam {

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
		if(eng>=40 && mya>=40 && math>=40)
			{
			if(eng>=75 || mya>=75 || math>=75)
				{System.out.print("Pass with Destination");}
			else 
				{System.out.print("Pass");}
			}
		
		else 
			{System.out.print("Fail");}
	}

}
