package java_basic;
import java.util.*;

public class Palindrome_string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter text here: ");
		String text = input.nextLine();
		check_palindrome(text);
		

	}

	private static void check_palindrome(String text) {
		int i = 0;
		int j = text.length() -1;
		boolean flag = true;
		
		
		while(i<j) {
			if(text.charAt(i) != text.charAt(j)) {
				
				flag  = false;
				break;
			}
			i++;
			j--;
		}
		
		if(flag) System.out.println("is a palindrome");
		else System.out.println("is not a palindrome");
		
		
	}

}
