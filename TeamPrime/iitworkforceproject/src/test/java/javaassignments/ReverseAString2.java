package javaassignments;

public class ReverseAString2 {

	public static void main(String[] args) {
		// This program is to reverse a string using StringBuffer class

		String s2 = "Welcome to Java Programming";

		StringBuffer sb = new StringBuffer(s2);
		System.out.println("The reverse string of Welcome to Java Programming is : "+ sb.reverse());

	}

}
