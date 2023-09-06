package java_basic;

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();
		System.out.println("the fibo series is");
		fibo(num);

	}

	private static int fibo(int num) {
		 int n1=0,n2=1,n3,i,count=num;  
		 
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		return 0;
	}

}
