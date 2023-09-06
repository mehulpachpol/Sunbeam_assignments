package java_basic;
import java.util.*;

public class Input {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name Here -- ");
		String name  = input.nextLine();
		System.out.println("Enter Age Here -- ");
		int age = input.nextInt();
		
		System.out.println("the students name is "+name+" and age is " + age);
		
		
		

	}

}
