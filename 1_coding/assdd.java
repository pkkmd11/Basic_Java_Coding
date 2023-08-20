package pk;

	import java.util.Scanner;
	import java.util.Random;

	public class assdd {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        Random rand = new Random();
	        
	        int num1 = rand.nextInt(10);
	        int num2 = rand.nextInt(10);
	        int num3 = rand.nextInt(10); 
	        
	        System.out.print("What is the sum of " + num1 + ", " + num2 + ", and " + num3 + "? ");
	        
	        int answer = input.nextInt();
	        int sum = num1 + num2 + num3;
	        
	        if (answer == sum) {
	            System.out.println("Congratulations, your answer is correct!");
	        } else {
	            System.out.println("Sorry, the correct answer is " + sum);
	        }
	    }
	}
