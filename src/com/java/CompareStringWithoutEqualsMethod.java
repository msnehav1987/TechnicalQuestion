package com.interview;

import java.util.Scanner;

public class CompareStringWithoutEqualsMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	System.out.println("Enter first String");
	String s1= in.next();
	System.out.println("Enter second String");
	String s2 = in.next();
	
	if(s1.length()==s2.length()){
	for(int i=0;i<=s1.length()-1;i++){
		if(s1.charAt(i)!=s2.charAt(i)){
			System.out.println("String "+  s1+ " is not equal to " + s2);
			return;
		}
		
	}
	System.out.println("String  " + s1+ " is  equal to " + s2);
		
	}else{
		System.out.println("String "+  s1+ " is not equal to " + s2);
	}
	}
	}
		
		



