package com.example.demo.Controller;

public class Reverse {
	public static void main(String[] args) {
		    String s = "I am coder";

		    String reverseS = "";

		    for (int i = 0; i < s.length(); i++) {
		        reverseS = s.charAt(i) + reverseS;
		    }

		    System.out.println(reverseS);

		}

	}


