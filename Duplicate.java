package java_basic;
import java.util.*;

public class Duplicate {

	private static final Object[] String = null;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] arr = {"q","i","p","u","i"} ;
		
		duplicate(arr);
		

	}

	private static void duplicate(String[] arr) {
		String[] ans = new String[arr.length] ;
		for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if( (arr[i].equals(arr[j])) && (i != j) )
                {
                	
                    System.out.println("Duplicate Element is : "+arr[j]);
                }
            }
        }
    }    
		
	}


