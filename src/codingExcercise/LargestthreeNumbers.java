package codingExcercise;

import java.util.Scanner;

public class LargestthreeNumbers {

static Scanner in;

	public static void main(String[] args) {
		int x ,y,z;
		System.out.println("Enter three Integers");
		
		in = new Scanner(System.in);
		x= in.nextInt();
		y= in.nextInt();
		z= in.nextInt();
		
		if(x>y && x>z)
			System.out.println("First Number is largest : " + x);
			else if (y>x && y>z)
				System.out.println("Scecond largest no is :" + y);
			else if(z>x && z>y)
				System.out.println("Third no is largest : " + z);
				
				
			}
		
		
		
	}


