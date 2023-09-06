package java_basic;
import java.util.*;


public class Table {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		for(int i = 0; i<11;i++) {
			System.out.println(num + " times " +i + " equals to " + num*i);
		}
		

	}

}
