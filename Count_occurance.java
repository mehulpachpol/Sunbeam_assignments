package java_basic;
import java.util.*;
public class Count_occurance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter the text : ");
		String text =  input.nextLine();
		count_occ(text);
		
		

	}

	private static void count_occ(String text) {
		Map<Character, Integer> mp = new HashMap<>();
		char[] characters = text.toCharArray();
		
		for(char i :characters) {
			
			if(mp.get(i) != null) {
				mp.put(i, mp.get(i)+1);
				
			}
			else {
				mp.put(i, 1);
			}
			
			
		}
		
		 for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
	            System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times");
	        }
		
	}

}
