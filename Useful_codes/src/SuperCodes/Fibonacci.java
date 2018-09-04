package SuperCodes;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
	 static int n1=0,n2=1,n3=0;  
	 static void printFibonacci(int count){  
	    if(count>0){  
	         n3 = n1 + n2;  
	         n1 = n2;  
	         n2 = n3;  
	         System.out.print(" "+n3); 
	         printFibonacci(count-1);  
	     }  
	 

}

	public static void main(String[] args) {
		System.out.println("Enter the number below which Fibonacci number is expected");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The number received is : "+n);
		 System.out.print(n1+" "+n2);//printing 0 and 1  
		  printFibonacci(n-2);//n-2 because 2 numbers are already printed 
	}

	
}
