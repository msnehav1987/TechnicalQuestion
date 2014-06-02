package codingExcercise;

import java.util.Scanner;

public class PrintTriangle {

	public static void main(String[] args) {
	int n, num =1,i,j;
	System.out.println("Enter the no of Row of  triangle you want");
	Scanner in = new Scanner(System.in);
	
	n = in.nextInt();
	
	System.out.println("Floyd's Triangle  :-");
	for(i=1; i<=n; i++){
		for(j=1; j<= i; j++){
			System.out.print(num+ "   ");
			num++;
		}
		System.out.println();
	}
	
	}

}
