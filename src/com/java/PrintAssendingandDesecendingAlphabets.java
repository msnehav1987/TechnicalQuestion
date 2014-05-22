package com.interview;

import java.util.ArrayList;
import java.util.Collections;

public class PrintAssendingandDesecendingAlphabets {

	public static void main(String[] args) {
		ArrayList<String> unsortedName = new ArrayList<String>();
		unsortedName.add("Neha");
		unsortedName.add("Vinod");
		unsortedName.add("Karthik");
		unsortedName.add("Kirtimaan");
		unsortedName.add("Hemalata");
		unsortedName.add("Pankaj");
		unsortedName.add("Maruti");
		unsortedName.add("Akhilesh");
		
			System.out.println(unsortedName);
			
			Collections.sort(unsortedName);
			
			System.out.println("Assending Order name : " + unsortedName);
			
			Collections.sort(unsortedName,Collections.reverseOrder());
			
			System.out.println("Desending Order Stirng : " + unsortedName);
			
			/*for(String name : unsortedName){
			 System.out.println(name);
		}*/
		
		
	}

}
