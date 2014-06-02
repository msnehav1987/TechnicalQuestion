package codingExcercise;

import java.util.Scanner;

public class PrintTableofAnyValue {

	 static Scanner in;

	public static void main(String[] args) {
		int num,count;
		System.out.println("Enter a number to print its multiplication");
		in = new Scanner(System.in);
		num=in.nextInt();
		
		System.out.println("Multiplication of table : "+num + " is :-");
		
	for( count =1;count<=10;count++){
		System.out.println(num+ "*" + count+"=" +(num*count));
		
	}
		
		

	}

}
