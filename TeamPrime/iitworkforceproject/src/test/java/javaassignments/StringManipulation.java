package javaassignments;

public class StringManipulation {

	public static void main(String[] args) {

		String s3 = "Welcome to the course Java Programming";

		// To get the length of the string
		System.out.println(s3.length());

		// To get the substring of the string
		System.out.println(s3.substring(22, 26));

		
		// To get the character at the particular index
		System.out.println(s3.charAt(3));

		//To get the position of particular character
		System.out.println(s3.indexOf('a'));
		
		// To get all the occurrences of the char 'a'
		System.out.println(s3.indexOf('a', (s3.indexOf('a')+1)));
		
	

	}

}
