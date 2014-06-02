package codingExcercise;

import java.util.Scanner;

public class FactorialofNumber {

 static Scanner in;

	public static void main(String[] args) {
		
		int n,c,fact=1;
		System.out.println("Enter an Integer to calculate it's Factorial :");
		in = new Scanner(System.in);
		n=in.nextInt();
		
		if(n<0){
			
			System.out.println("Number should be non-Negative");
			
		}else{
			
			for(c=1;c<=n;c++){
				fact = fact * c;
				
			}
			System.out.println("Factorial of no is :"+n+" is  = " +fact);
		}
		
	}

}
