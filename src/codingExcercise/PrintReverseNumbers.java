package codingExcercise;

import java.util.Scanner;

public class PrintReverseNumbers {

	public static void main(String[] args) {
		int num,rev =0;
		System.out.println("Enter the no to reverse : ");
		Scanner in = new Scanner(System.in);
		
		num = in.nextInt();
		while(num !=0){
			rev = rev * 10;
			rev = rev + num%10;
			num = num/10;
					
		}

		System.out.println("Reverse No is : "+ rev);
	}

}
