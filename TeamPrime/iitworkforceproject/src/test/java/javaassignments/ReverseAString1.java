package javaassignments;

public class ReverseAString1 {

	public static void main(String[] args) {
		// This program is to reverse a String

		String s1 = "Welcome";

		int len = s1.length();
		String rev = "";

		for (int i = len-1; i >= 0; i--) {

			rev = rev + s1.charAt(i);
		}

		System.out.println("The reverse of string Welcome is: " + rev);
		System.out.println("The string is : " + s1);
		System.out.println("The string length is : " + s1.length());

	}

}

