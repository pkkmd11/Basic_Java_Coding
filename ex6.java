import java.util.Scanner;


public class ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1,num2,add,sub,mul,div;
		int op;
		Scanner input=new Scanner (System.in);
		System.out.print("Enter First Number:");
		num1= input.nextDouble();
		System.out.print("Enter Second Number:");
		num2= input.nextDouble();
		System.out.println("Operator:: Adding is 1, Subtracting is 2, multiplying is 3, dividing is 4.");
		System.out.print("Choose :");
		op=input.nextInt();
		if(op==1){
			add=num1+num2;System.out.print("Answer is "+add);
		}
		else if(op==2){
			sub=num1-num2;System.out.print("Answer is "+sub);
		}
		else if(op==3){
			mul=num1*num2;System.out.print("Answer is "+mul);
		}
		else if(op==4){
			div=num1/num2;System.out.print("Answer is "+div);
		}
		else {
			System.out.print("Your Choose Operator is Error");
		}
		
	}

}
