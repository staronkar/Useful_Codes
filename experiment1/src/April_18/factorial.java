package April_18;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		int f=1;
		Scanner input = new Scanner(System.in);
		
		   for(int i=input.nextInt(); i> 1; i--){
			   f=f*i;		      	       
		   } 
		   System.out.println(f);

	}

}
