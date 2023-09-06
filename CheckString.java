package java_basic;
import java.util.Scanner;


public class CheckString {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		String text = input.nextLine();
		System.out.println("The input text is "+text);
		uppercase(text);
		lowecase(text);
		specialchar(text);
		contoupper(text);
		
		
		

	}

	private static void contoupper(String text) {
		System.out.println("uppercase== " + text.toUpperCase());
		
	}

	private static void specialchar(String text) {
		
		int count = 0;
		for (int i = 0; i < text.length(); i++) {
			 
            
            if (!Character.isDigit(text.charAt(i))
                && !Character.isLetter(text.charAt(i))
                && !Character.isWhitespace(text.charAt(i))) {
                
                count++;
            }
        }
 
        if (count == 0)
            System.out.println("No Special Characters found.");
        else {
        	System.out.println("Number of special charcters are " + count);
            
    }
		


		
		
	}

	private static void lowecase(String text) {
		
		int count = 0;
		
		for(int i = 0 ;i<text.length();i++) {
			if(!Character.isDigit(text.charAt(i))
                && !Character.isWhitespace(text.charAt(i))
                && !Character.isUpperCase(text.charAt(i))) {
				
				count++;
			}
			
		}
		
		System.out.println("Number of lowercase charcters " + count);

		
	}

	private static void uppercase(String text) {
int count = 0;
		
		for(int i = 0 ;i<text.length();i++) {
			if(!Character.isDigit(text.charAt(i))
                && !Character.isWhitespace(text.charAt(i))
                && !Character.isLowerCase(text.charAt(i))) {
				
				count++;
			}
			
		}
		
		System.out.println("Number of uppercase charcters " + count);
		
	}

}
