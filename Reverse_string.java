package java_basic;
import java.util.*;
public class Reverse_string {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the text to reverse: ");  
		String text = input.nextLine();
		reverse(text);
		

	}

	private static void reverse(String text) {
		int n = text.length();
		
		
		int j = n;
		String ans = "" ;
		char temp ;
		for(int i = n-1;i>=0; i--) {
			
			ans += text.charAt(i);
					
			
		}
		
		System.out.println("the reverse of "+text+ " is "+ans);
		
	}

}
