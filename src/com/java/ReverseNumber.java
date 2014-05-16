package com.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) {
		
		String str;
        int no,k,rev;
        rev=0;

        try{
               BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
               System.out.print("Enter Number you want to reverse : ");
               System.out.flush();

               str=obj.readLine();
               no=Integer.parseInt(str);

                     while(no > 0)
                      {
                           k = no %   10;
                            rev = rev * 10 + k; 
                           no=no/10;
                      }

               System.out.println("Reverse Number is : "+rev);
           }

           catch(Exception e)
           {}
		
	}

}
