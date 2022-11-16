package com.example.demo.Controller;

public class Palindrome {

	public static void main(String[] args) {
		
			    String str = "Radar", reverseStr = "";
			    
			    int strLength = str.length();

			    for (int i = (strLength - 1); i >=0; --i) {
			      reverseStr = reverseStr + str.charAt(i);
			    }

			    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			      System.out.println(str + " is a Palindrome String.");
			    }
			    else {
			      System.out.println(str + " is not a Palindrome String.");
			    }
			
			
			
			
		
			/*int n=313, red, temp=n,sum=0;
		    while(n>0) {
		    	red=n%10;
		    	sum=(sum*10)+red;
		    	n=n/10;*/
		    }
			
			
				
					

	}


