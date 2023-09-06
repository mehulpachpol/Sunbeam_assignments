package java_basic;
import java.util.*;

public class Factorial {
	
	public static void main(String[] args) {
		
	
	Scanner input = new Scanner(System.in);
	System.out.println("enter a number");
	int num = input.nextInt();
	int output = factorial(num);
	System.out.println(num+"! is equal to " +output);
	
	}

	private static int factorial(int num) {
		int temp = num;
		int fact = 1;
		while(temp>1) {
			fact = fact*temp;
			temp -= 1;	
			
		}
		return fact;
	}
	
	
	

}
