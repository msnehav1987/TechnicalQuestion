?07-?05-?2014
package com.java;

import java.io.IOException;



public class ReverseNumUsingString {
	
	public static int Reverse(int n){
		String input = String.valueOf(n);
		String res = "";
		
		for(int i =input.length()-1;i>=0;i--){
			
			res=res+input.charAt(i);
			
		}
		int reverseint=Integer.parseInt(res);
		
		
		
		return reverseint;
	}

	public static void main(String[] args) throws IOException {
		
		       
        int rev = ReverseNumUsingString.Reverse(12548);
        System.out.println(rev);
	}

}
